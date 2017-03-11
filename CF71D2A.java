
import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF71D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int y= in.nextInt();
		while(!distinct(++y)) {}
		System.out.println(y);

	}


	public static boolean distinct(int n) {
		boolean[] tmp = new boolean[10];


		while(n > 0) {
			if(tmp[n%10]) return false;
			tmp[n%10] = true;

			n/= 10;
		}

		return true;
	}

}


