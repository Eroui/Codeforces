import java.util.*;


public class CF437D2A {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] oc1, oc2;
		int[] l = new int[4];

		oc1 = new int[4];
		oc2 = new int[4];

		for(int i = 0; i < 4; i++) {
			String line = in.nextLine().split("\\.")[1];
			l[i] = line.length();
		}



		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) continue;

				if(2*l[i] <= l[j]) oc1[i]++;
				if(l[i] >= 2*l[j]) oc2[i]++;


				System.err.println(i+" "+j+" -> "+l[i]+" "+l[j]);
			}
		}



		System.err.println(Arrays.toString(l));
		System.err.println(Arrays.toString(oc1));
		System.err.println(Arrays.toString(oc2));

		int count1 = 0, count2 = 0;
		int ans1 = -1;
		int ans2 = -1;



		for(int i = 0; i < 4; i++) {
			if(oc1[i] == 3) {
				count1++;
				ans1 = i;
			}

			if(oc2[i] == 3) {
				count2++;
				ans2 = i;
			}
		}

		System.err.println(count1+" -> "+ ans1);
		System.err.println(count2+" -> "+ ans2);


		if(count1 != 1 && count2 != 1) System.out.println("C");
		else if(count1 == 1 && count2 !=1) {
			if(ans1 == -1) System.out.println("C");
			else System.out.println(""+ (char) ('A'+ans1));
		}
		else if(count2 == 1 && count1 != 1){
			if(ans2 == -1) System.out.println("C");
			else System.out.println(""+ (char) ('A'+ans2));
		}else {
			System.out.println("C");
		}

	}
}