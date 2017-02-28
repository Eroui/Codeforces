import java.util.*;
import java.io.*;
import java.math.*;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();

		int min = Math.min(s1.length(), s2.length());
		int max = Math.max(s1.length(), s2.length());

		int ans = lus(s1, s2);
		System.out.println(max - ans == 0 ? -1: max - ans);

	}

	public static int lus(String a, String b){
		int m = a.length();
		int n = b.length();
		int[][] dp = new int[m+1][n+1];
	 
		for(int i=0; i<=m; i++){
			for(int j=0; j<=n; j++){
				if(i==0 || j==0){
					dp[i][j]=0;
				}else if(a.charAt(i-1) == b.charAt(j-1)){
					dp[i][j] = 1 + dp[i-1][j-1];
				}else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
	 
		return dp[m][n];
	}

}

