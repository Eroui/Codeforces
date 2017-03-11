
import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF472D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if(n % 2 == 0) System.out.println((n-8)+" "+8);
		else System.out.println((n-9)+" "+9);

	}
}


