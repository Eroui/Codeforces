import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF236D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.next().toCharArray();
		int[] cnt = new int[256];
		int ans = 0;

		for(char c: arr) {
			if(cnt[c] == 0) ans++;
			cnt[c]++;
		}

		System.out.println(ans%2 == 0 ? "CHAT WITH HER!": "IGNORE HIM!");

	}


}