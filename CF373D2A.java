import java.util.*;

public class CF373D2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int k = in.nextInt()<<1;
		int[] occs = new int[10];
		for(int i = 0; i < 4; i++) {
			char[] tab = in.next().toCharArray();

			for(int j = 0; j < 4; j++) {
				if(tab[j] == '.') continue;
				int num = Integer.parseInt(""+ tab[j]);

				occs[num]++;
			}
		}

		System.err.println(Arrays.toString(occs));


		boolean can = true;
		for(int i = 0; i <= 9; i++) {
			if(occs[i] > k) can = false;
			if(!can) break;
		}

		System.out.println(can? "YES":"NO");


	}

}