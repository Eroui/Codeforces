import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF110D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();

		if(isNLucky(n)) System.out.println("YES");
		else System.out.println("NO");

	}



	public static boolean isNLucky(long n)  {

		long cnt = 0;
		while(n > 0) {
			if(n%10 == 4  || n%10 == 7) cnt++;
			n /= 10;
		}

		return isLucky(cnt);

	}

	public static boolean isLucky(long n) {

		if(n == 4 || n == 7) return true;
		if(n < 10) return false;

		while(n > 0) {
			if(n%10 != 7 && n%10 != 4) return false;
			n /= 10;
		}

		return true;
	}	


}


