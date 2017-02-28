import java.util.*;


public class CF488D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long n = in.nextLong();
		long ans = 1;

		while(!isLucky(n+ans)) {
			ans++;
		}

		System.out.println(ans);

	}



	public static boolean isLucky(long number) {
		if(number < 0) number *= -1;
		while(number != 0) {
			if(number%10 == 8) return true;
			number /= 10; 
		}

		return false;
	}
}