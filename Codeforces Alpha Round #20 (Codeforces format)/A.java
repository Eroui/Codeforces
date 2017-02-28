import java.util.*;

public class A {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] tokens = line.split("/+");

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < tokens.length; i++) {

			if(i > 0) sb.append("/");
			sb.append(tokens[i]);
		}


		if(tokens.length == 0) {
			System.out.println("/");
		}else System.out.println(sb.toString());
	}

}