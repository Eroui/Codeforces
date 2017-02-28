import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 */

public class CF376D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split("\\^");
		System.err.println(Arrays.toString(tokens));
		String left = tokens[0];
		String right = tokens[1];

		long l = getWeight(left, false);
		long r = getWeight(right, true);

		if(l < r) System.out.println("right");
		else if(l > r) System.out.println("left");
		else System.out.println("balance");
		
	}



	public static long getWeight(String s, boolean right) {
		char[] tab = s.toCharArray();
		int l = tab.length;
		long ans = 0;
		for(int i = 0; i < l; i++){
			if(tab[i] == '=') continue;

			
			if(right) ans += Integer.parseInt(""+tab[i])*(i+1);
			else ans += Integer.parseInt(""+tab[i])* (l-i);
		}

		return ans;
	}
}