import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF467D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int ans = 0;
		for(int i = 0; i < n; i++) {
			int p = in.nextInt();
			int q = in.nextInt();

			if(q - p >= 2) ans++;
		}

		System.out.println(ans);

	}


}