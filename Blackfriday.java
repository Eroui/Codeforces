import java.util.*;

public class Blackfriday {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] tab = new int[n];
		int[] freq = new int[105];


		for(int i =0; i < n; i++) {
			tab[i] = in.nextInt();
			freq[tab[i]]++;
		}


		int ans = -1;
		int max = -1;
		for(int i = 0; i < n; i++) {
			if(tab[i] > max && freq[tab[i]] == 1) {
				max = tab[i];
				ans = i+1;
			} 
		}

		if(ans == -1) System.out.println("none");
		else System.out.println(ans);




	}
}


