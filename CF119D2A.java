import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF119D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		int turn = 0;

		while(n > 0) {
			if(turn == 0) {
				n -= gcd(n, a);
			}else {
				n-= gcd(n, b);
			}


			++turn;
			turn %= 2;
		}

		++turn;
			turn %= 2;
		

		System.out.println(turn);

	}


	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}

}


