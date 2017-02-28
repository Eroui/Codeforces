import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF108D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String[] tokens = s.split(":");

		int h = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);

		m++; if(m >= 60) {m = 0; h= (h+1)%24;}
		while(!isPal(toStr(h)+":"+toStr(m))) {
			m++; if(m >= 60) {m = 0; h= (h+1)%24;}
		}


		System.out.println(toStr(h)+":"+toStr(m));
		
	}

	public static String toStr(int h) {
		return ""+(h <10 ?  "0": "")+h;
	}


	public static boolean isPal(String s) {
		char[] arr = s.toCharArray();
		int l = arr.length;
		for(int i = 0; i <= l/2; i++) {
			if(arr[i] != arr[l-i-1]) return false;
		}

		return true;
	}
}