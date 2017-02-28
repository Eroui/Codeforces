import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * Verdi : AC
 */

public class CF152D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int m= in.nextInt();

		String[] grades = new String[n];
		for(int i = 0; i < n; i++) {
			grades[i] = in.next();
		}

		boolean[] succ = new boolean[n];

		for(int i = 0;i < m; i++) {
			int max = 0;
			for(int j = 0; j <n; j++) {
				max = Math.max(max, Integer.parseInt(""+grades[j].charAt(i)));
			}

			for(int j = 0; j < n; j++) {
				if(Integer.parseInt(""+grades[j].charAt(i)) == max) succ[j] = true;
			}
		}

		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(succ[i]) ans++;
		}

		System.out.println(ans);

		
	}
}