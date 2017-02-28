import java.util.*;
import java.io.*;
import java.math.*;


public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int max = 1000;
		for(int i = 1; i <= max; i++) {
			int tmp = n*i+1;
			if(!isPrime(tmp)) {
					System.out.println(i);
					break;
			}
		}


	}

	private static boolean isPrime(int num) {
	    if (num == 2) return true;
	    if (num % 2 == 0) return false;
	    for (int i = 3; i * i < num; i += 2)
	        if (num % i == 0) return false;
	    return true;
	}
}