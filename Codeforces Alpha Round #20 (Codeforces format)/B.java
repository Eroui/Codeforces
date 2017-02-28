import java.util.*;

public class B {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		if(a == 0 && b == 0 && c == 0) {
			System.out.println(-1);
		}else if(a == 0 && b == 0){

			System.out.println(0);

		}else if(a == 0) {

			double r = -1.0*c / b;
			if(r == 0) r = Math.abs(r);
			System.out.println(1);
			System.out.println(r);

		}else {

			long delta = (1l*b*b) - (4l*a*c);
			if(delta < 0) {

				System.out.println(0);
			}else if(delta == 0) {
				System.out.println(1);
				double r = (-1.0*b)/(2*a);

				System.out.println(r);
			}else {
				System.out.println(2);
				double r1;
				double r2;


				r1 = (-1.0*b - Math.sqrt(delta))/ (2 * a);
				r2 = (-1.0*b + Math.sqrt(delta))/ (2 * a);

				System.out.println(Math.min(r1, r2));
				System.out.println(Math.max(r1, r2));
			}

		}

	}

}