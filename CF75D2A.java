import java.util.*;


public class CF75D2A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long a = in.nextLong();
		long b = in.nextLong();

		long c = a + b ;


		if(rz(c) == rz(a)+rz(b)) System.out.println("YES");
		else System.out.println("NO");
	}

	public static long rz(long l) {
		long ans = 0;
		long pow = 1;

		while(l != 0) {
			long mod = l%10;
			l/= 10;

			if(mod == 0) continue;
			ans = mod * pow + ans;
			pow *= 10;
		}
		System.err.println(l+" -> "+ans);
		return ans;

	}
}