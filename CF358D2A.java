import java.util.*;

// Verdic  = WA

public class CF358D2A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] arr = new int[n];

		boolean ans = true;
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();

			if(!ans) continue;

			for(int j = 0; j < i; j++) {
				for(int k = 0; k < i; k++) {
					for(int t = 0; t < k; t++) {

						if(arr[i] >= arr[j]) continue;
						if(arr[t] >= arr[k]) continue;

						if(arr[t]<arr[j] && arr[j] < arr[k] && arr[k] < arr[i]) {
							ans = false;
							continue;
						}

						if(arr[j]<arr[t] && arr[t] < arr[i] && arr[i] < arr[k]) {
							ans = false;
							continue;
						}
					}
				}
			}
		}


		System.out.println(ans ? "no": "yes");

	}


	public static int min(int i, int j){
		return Math.min(i, j);
	}

	public static int max(int i, int j) {
		return Math.max(i, j);
	}

}

