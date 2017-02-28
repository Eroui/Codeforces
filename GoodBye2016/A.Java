import java.util.*;
import java.math.*;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();

		int MAX = 240 - K;
		long ans = 0;
		long ctime = 0;
		for(int i = 1; i <= N; i++) {
			long time = 5l *i;

			if(ctime + time > MAX) break;
			ans++;
			ctime += time;
		}

		System.out.println(ans);
	}
}