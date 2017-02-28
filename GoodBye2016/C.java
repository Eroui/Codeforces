import java.util.*;

public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		int[] rates = new int[T];
		int[] divs  = new int[T];

		int sum = 0;
		boolean b = true;
		boolean bb = true;
		for(int i = 0; i < T; i++) {
			rates[i] = in.nextInt();
			divs[i] = in.nextInt();
			sum += divs[i];

			if(divs[i] == 2) b = false;
			if(divs[i] == 1) bb = false;
		}

		long rate = 0;

		if(divs[T-1] == 2) rate = 1899;
		else rate = 1900;



		for(int i = T-2; i >= 0; i--) {
			rate -= rates[i];
		}

		boolean ans = true;
		if(divs[0] == 2 && rate >= 1900) rate = 1899;
		for(int i = 0; i <= T-1; i++) {
			if(divs[i] == 1 && rate < 1900) {
				ans = false;
				break;
			}

			rate += rates[i];
		}


		if(!ans) System.out.println("Impossible");
		else if(bb) {
			rate = 1899 + sum;
			if(rate > 1899) System.out.println("Impossible");
			else System.out.println(rate);
		}else if(b) {
			System.out.println("Infinity");
		}else {
			if(rate < 1900 && divs[T-1] == 1) System.out.println("Infinity");
			System.out.println(rate);
		}
	}
}