import java.util.*;


public class CF445D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		boolean black = true;
		boolean lastf = true;
		String ans = "";
		for(int i = 0; i < n; i++) {
			
			if(i != 0) black = ! lastf;

			char[] tab = in.next().toCharArray();
			for(int j = 0; j < m; j++) {

				if(j == 0) lastf = black;

				black = !black;

				if(tab[j] == '-') {
					ans += "-";
					continue;
				}
				ans += (black?"W":"B"); 

			}

			ans += "\n";
		}

		System.out.print(ans);

	}
}