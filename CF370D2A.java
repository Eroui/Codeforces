import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF370D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();

		
		System.out.print(((x1==x2 || y1 == y2)? "1": "2")+" ");
		if ((x1 + y1) % 2 != (x2 + y2) % 2) 
			System.out.print("0 "); 
		else {
	        if (x1 + y1 == x2 + y2 || x1 - y1 == x2 - y2) 
	        	System.out.print("1 ");
	        else 
	        	System.out.print("2 ");
	    }
		System.out.println(Math.max(Math.abs(x1-x2), Math.abs(y1-y2))+" ");
		
	}

}