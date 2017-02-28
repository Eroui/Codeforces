import java.util.*;

public class B {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int axis = 0;

		boolean ans = true;

		while(T-->0) {
			int dist = in.nextInt();
			String dir = in.next();

			if(!ans) continue;

			if(dir.equals("North")) {
				while(dist-->0 && ans) {
					axis -= 1;
					if(axis < 0) ans = false;
				}

			}else if(dir.equals("South")) {
				while(dist-->0) {
					axis+= 1;
					if(axis > 20000 && ans) {
						ans = false;
					}
				}
			}else if(dir.equals("West")) {
				if((axis == 0) || (axis == 20000)){
					ans = false;
				}
			}else {
				if((axis == 0) || (axis == 20000)){
					ans = false;
				}
			}
		}

		System.out.println(ans && axis == 0? "YES": "NO");

	}
}