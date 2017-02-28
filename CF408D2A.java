
import java.util.*;



public class CF408D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cc = Integer.parseInt(in.nextLine());
		String[] tokens1 = in.nextLine().split("\\s+");

		long ans = Long.MAX_VALUE;
		for(int i = 0; i < tokens1.length; i++) {
			int p = Integer.parseInt(tokens1[i]);
			String[] tokens = in.nextLine().split("\\s+");
			long sum = 0;
			for(int j = 0; j < p; j++) {
				sum += Integer.parseInt(tokens[j])*5;
				sum += 15;
			}

			ans = Math.min(ans, sum);
		}

		System.out.println(ans);


	}
}