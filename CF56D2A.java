import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF56D2A {

	static String[] drinks = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long ans = 0;

		for(int i = 0; i < n ; i++) {
			String token = in.next();
			try {
				int tmp = Integer.parseInt(token);
				if(tmp < 18) ans++;
			}catch(Exception e) {
				if(isDrink(token)) ans++;
			}
		}


		System.out.println(ans);
	}


	public static boolean isDrink(String s) {

		for(String d: drinks) {
			if(s.equals(d)) return true;
		}

		return false;
	}
}