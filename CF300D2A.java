import java.util.*;


public class CF300D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		Stack<Integer> s1 = new Stack<Integer>(); // for < 0 numbers
		Stack<Integer> s2 = new Stack<Integer>(); // for > 0 numbers
		Stack<Integer> s3 = new Stack<Integer>(); // for 0's (there will be at least one 0) 

		for(int i = 0; i < n; i++) {
			int tmp = in.nextInt();

			if(tmp < 0) s1.push(tmp);
			else if(tmp > 0) s2.push(tmp);
			else s3.push(tmp);

		}


		if(s1.size()%2 == 0) s3.push(s1.pop());	// if there is even <0 number just remove any one and put it in the third One
		if(s2.size() == 0) {	// if second set is empty you need to get 2 elements from the first Set
			s2.push(s1.pop());
			s2.push(s1.pop());
		}


		System.out.print(s1.size());
		while(!s1.empty()) System.out.print(" "+s1.pop());
		System.out.println();

		System.out.print(s2.size());
		while(!s2.empty()) System.out.print(" "+s2.pop());
		System.out.println();

		System.out.print(s3.size());
		while(!s3.empty()) System.out.print(" "+s3.pop());


	}
}