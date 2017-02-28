import java.util.*;

public class CF353D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();


		int sum1 = 0, sum2 = 0;
		int count = 0;

		for(int i= 0; i < N; i++) {
			int h1 = in.nextInt();
			int h2 = in.nextInt();

			if(h1%2 != h2%2) count++;
			sum1 += h1;
			sum2 += h2;
 		}

 		if(sum1 % 2 == 0 && sum2 % 2 == 0) System.out.println(0);
 		else {

 			if(sum1 %2 != sum2 %2) System.out.println(-1);
 			else if(count == 0) System.out.println(-1);
 			else System.out.println(1);

 		}

	}

}