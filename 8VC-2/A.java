import java.util.*;
import java.io.*;


public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int a, b, cnt = 0, left; 
		 int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		a = in.nextInt();
		b = in.nextInt();

		left = m[a-1];
		if(b != 1) { left -= (8-b); cnt = 1; }
		if(left % 7 == 0) cnt += (left / 7);
		else cnt += (left / 7 + 1);


		System.out.println(cnt);

	}
}