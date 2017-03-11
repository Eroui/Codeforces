import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF284D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long p = in.nextLong();

		int cnt = 0;
		for(int x = 1; x < p; x++) {

			boolean b = true;
			long pow = 1;
			for(int i = 1; i<= p-2; i++) {
				pow *= x;
				if((pow-1)%p == 0) {
					b = false;
					break;
				}
			}

			if(!b) continue;
			if((pow*x - 1) % p == 0) {
				System.err.println(x);
				++cnt;
			}

		}

		System.out.println(cnt);
	}

}