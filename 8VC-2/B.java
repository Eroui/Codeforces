import java.util.*;
import java.io.*;


public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n, m, k;

		n = in.nextLong();
		m = in.nextLong();
		k = in.nextLont();

		m -= n;

		System.out.println(bs());
	}


	public static long bs() {
		long st = 0, end = m, mid;
		while(st < end) {
			mid = (st+end)/2;
			if(check(mid)) {
				st = mid+1;
			} else {
				end =  mid-1;
			}
		}

		return check(end) ? end : (check(mid) ? mid :st); 
	}


	public static boolean check(long p) {
		long lf = k-1, rt = k+1;

		return 1;
	}
}