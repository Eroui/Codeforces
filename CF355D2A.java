import java.util.*;

public class CF355D2A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int d = in.nextInt();


		if(d == 0) {
			if(k == 1) System.out.println(0);
			else System.out.println("No solution");
		}else {
			System.out.print(d);

			for(int i = 0; i < k-1; i++) 
				System.out.print(0);
			
			System.out.println();
		}

	}

}