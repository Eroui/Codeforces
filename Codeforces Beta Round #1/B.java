import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * @veridc: Wrong Answer
 */

public class B {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();

	    for(int i=0; i < n; i++) {
	        String s = in.next();
	        char[] arr = s.toCharArray();
	        int value1= 0;
	        int value2 = 0;
	        
	       if((s.split("R[0-9]+C[0-9]+")).length == 0) {
	            int j = 1;
                String v1 = "";
	            while(arr[j] != 'C') {
	                value1 *= 10;
	                value1 += Integer.parseInt(""+arr[j]);
	                
	                j++;
	            }
	            j++;
	            while(j < arr.length){
	                value2 *= 10;
	                value2 += Integer.parseInt(""+arr[j]);
	                
	                j++;
	            }
	            
	            System.err.println(value2);
	            while(value2 != 0) {
	                
	                int tmp = (--value2) % 26;
	                
	                v1 = ""+ ((char)( 'A'+ tmp)) + v1;
	                value2 /= 26;
	                System.err.println(value2+" "+tmp);
	            }
	            
	            System.out.print(v1);
	            System.out.println(value1);
	       }else {
    	        int j = 0;
	            while(arr[j] <= 'Z' && arr[j] >= 'A') {
	                value1 *= 26;
	                value1 += 1 + (int) arr[j] - 'A' ;
	                
	                j++;
	            }
	            
	            //System.err.println(j+" "+arr.length);
	            while(j < arr.length){
	                value2 *= 10;
	                //System.err.println(arr[j]);
	                value2 += Integer.parseInt(""+arr[j]);
	                
	                j++;
	            }
	            
	            System.out.println("R"+value2+"C"+value1);
	       }
	        
	        
	    }
	    
	}
}