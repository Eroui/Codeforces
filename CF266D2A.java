import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF266D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] arr = in.next().toCharArray();

		int ans = 0;
		for(int i = 1; i < n; i++) {
			if(arr[i] == arr[i-1]) ans++;
		}

		System.out.println(ans);
	}


}