import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * Verdic : AC
 */

public class CF189D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int ans = 0;

		for(int i = 0; i*a <= n; i++) {
			for(int j = 0; j*b + i*a <= n; j++) {
				int k = (n - i*a - j*b)/c;
				if(i*a + j*b + k*c == n) {
					ans = Math.max(ans, i+j+k);
				}
			}
		}
		
		System.out.println(ans);

	}
}