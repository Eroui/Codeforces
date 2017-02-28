import java.util.*;
import java.io.*;
import java.math.*;


public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		TreeSet<String> s1 = new TreeSet<String>();
		TreeSet<String> s2 = new TreeSet<String>();

		for(int i = 0; i < n; i++) s1.add(in.next());
		for(int j = 0; j < m; j++) s2.add(in.next());

		TreeSet<String> inter = new TreeSet<String>(s1);
		inter.retainAll(s2);


		int k = inter.size();
		n-= k;
		m-= k;

		if(k % 2 == 0) {
			if(n > m) System.out.println("YES");
			else System.out.println("NO");
		}else {
			if(n >= m) System.out.println("YES");
			else System.out.println("NO");
		}


	}
}