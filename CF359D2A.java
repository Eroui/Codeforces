
import java.util.*;



public class CF359D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		boolean b = false;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int tmp = in.nextInt();
				if(tmp == 0) continue;


				if(i == 0 || j == 0 || i == n-1 || j == m-1) b = true;
			}
		}
		System.out.println(b ? "2": "4");
	}
}