import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF31D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] sums = new int[1001];
		int[] arr = new int[n];
		boolean ans = false;

		for(int i = 0; i < n; i++) {
			int tmp = in.nextInt();
			arr[i] = tmp;
			sums[tmp] = (i+1);
		}


		for(int i = 1; i < n; i++) {

			if(ans) break;
			for(int j = 0; j < i; j++) {
				if(arr[i]+arr[j] <= 1000 && sums[arr[i] + arr[j]] != 0) {
					System.out.println(sums[arr[i]+arr[j]]+" "+(i+1)+" "+(j+1));
					ans = true;
					break;
				}
			}
		}

		if(!ans) System.out.println(-1);



	}


}