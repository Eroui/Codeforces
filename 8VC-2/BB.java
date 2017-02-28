import java.util.*;
import java.io.*;


public class BB {

	public static long n, m, k;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextLong();
		m = in.nextLong();
		k = in.nextLong();

		m = m-n;

		long ans = BS();
		System.out.println(ans+1);

	}


	public static long BS() {
		long min = 0;
		long max = m;
		long mid = (min+max)/2;

		while(min <= max) {
			mid = (min+max)/2;
			if(check(mid)) {
				min = mid+1;
			}else {
				max = mid-1;
			}
		}


		return check(max)? max: (check(mid) ? mid : min);

	}

	public static boolean check(long p) {
		long lCnt = k-1;
		long rCnt = n-k;
		long left = 0;
		long right = 0;

		if(lCnt > p) lCnt = p;
		if(rCnt > p) rCnt = p;

		left = p*lCnt - ((lCnt * (lCnt+1)) / 2 );
		right = p*rCnt - ((rCnt * (rCnt+1)) / 2);


		return ((left+right+p) <= m);
	}
}