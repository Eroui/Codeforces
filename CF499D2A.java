import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * Verdic  : AC
 */

public class CF499D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n, x;
		n = in.nextInt();
		x = in.nextInt();

		long ans = 0;
		int time = 0;
		for(int i = 0; i < n; i++) {
			int s = in.nextInt();
			int e = in.nextInt();
			int sum = 0;
			while(true) {
				time += x;
				if(time  >= s) {
					time  -= x;
					sum += (e-time);
					time  += sum;
					break;
				}
			}

			ans+= sum;
		}

		System.out.println(ans);
		
	}
}