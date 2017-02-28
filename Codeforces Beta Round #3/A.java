import java.util.*;

/**
 *  @Author : Eroui Abdelaziz <kapi.abdel@gmail.com
 *  Verdic 	: Not Yet Submitted
 */



public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		String t = in.next();

		int scol = s.charAt(0) - 'a' + 1;
		int srow = Integer.parseInt(""+s.charAt(1));

		int tcol = t.charAt(0) - 'a' + 1 ; 
		int trow = Integer.parseInt(""+t.charAt(1));

		System.err.println(scol+" "+srow);
		System.err.println(tcol+" "+trow);

		System.out.println(Math.max(Math.abs(scol - tcol), Math.abs(srow - trow)));
		while(scol != tcol || srow != trow) {
			String ans = "";

			if(scol < tcol) {
			 	ans = "R";
			 	scol++;
			}
			else if(scol > tcol) {
				ans = "L";
				scol--;
			}

			if(srow > trow) {
				ans += "D";
				srow--;
			}
			else if(srow < trow) { 
				ans += "U";
				srow++;
			}

			System.out.println(ans);
		}
		

	}
}
