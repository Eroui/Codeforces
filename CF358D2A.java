import java.util.*;

public class CF358D2A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt()-1;
		int prev = in.nextInt();
		int maxi = 10000000;
		int mini = -10000000;


		boolean ans = false;
		while(n-->0) {
			int tmp = in.nextInt();

			if(tmp > prev) {
				mini = Math.max(mini, prev);
				if(tmp > mini){
					ans = true;
					break;
				}
			}else {
				maxi = min(maxi, prev);
				if(tmp < maxi) {
					ans = true;
					break;
				}
			}

			prev = tmp;
		}

		System.out.println(ans ? "yes": "no");
	}


	public static int min(int i, int j){
		return Math.min(i, j);
	}

	public static int max(int i, int j) {
		return Math.max(i, j);
	}

}

