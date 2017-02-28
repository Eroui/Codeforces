import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : 
 */

public class CF108D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int r1 = in.nextInt();
		int r2 = in.nextInt();
		int c1 = in.nextInt();
		int c2 = in.nextInt();
		int d1 = in.nextInt();
		int d2 = in.nextInt();

		int a11, a12, a22, a21;
		a11 = (r1 + c1 - d2)/2;
		a12 = r1 - a11;
		a21 = c1 - a11;
		a22 = d1 - a11;


		if(a11 <= 0 || a12 <= 0 || a21 <= 0 || a22 <= 0 ) {
			System.out.println(-1);
		}else if(a11 >= 10 || a12 >= 10 || a21 >= 10 || a22 >= 10 ) {
			System.out.println(-1);
		}else if(a11 == a12 || a11 == a21 || a11 == a22 || a12 == a21 || a12 == a22 || a21 == a22){
			System.out.println(-1);
		}else if(a11 + a12 != r1 || a11 + a21 != c1 || a21 + a22 != r2 || a12 + a22 != c2 || a11 + a22 != d1 || a21 + a12 != d2 ) {
			System.out.println(-1);
		}else {
			System.out.println(a11+" "+a12);
			System.out.println(a21+" "+a22);
		}
		
	}
}