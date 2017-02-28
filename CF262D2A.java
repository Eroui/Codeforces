import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * Verdic : AC
 */

public class CF262D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		int ans = 0;
		for(int i = 0; i < n; i++) {
			int num = in.nextInt();
			int count = 0; 

			while(num > 0) {
				count += ((num%10 == 4) || (num%10 == 7))? 1:0;
				num /= 10;
			}

			if(count <= k) ans++;
		}

		System.out.println(ans);
		

		
	}
}