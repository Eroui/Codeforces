import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * Veridc: Not Yet Submitted
 */

class Main
{

	public static double eps = 0.00001;

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    double P1X = in.nextDouble(), P1Y = in.nextDouble();
	    double P2X = in.nextDouble(), P2Y = in.nextDouble();
	    double P3X = in.nextDouble(), P3Y = in.nextDouble();
	    
	    double P12 = Math.sqrt((P1X - P2X)*(P1X - P2X) + (P1Y - P2Y)*(P1Y - P2Y));
	    double P23 = Math.sqrt((P2X - P3X)*(P2X - P3X) + (P2Y - P3Y)*(P2Y - P3Y));
	    double P13 = Math.sqrt((P1X - P3X)*(P1X - P3X) + (P1Y - P3Y)*(P1Y - P3Y));
	    
	    double P = (P12+P23+P13)/2;
	    System.err.println("P "+P);
	    double S = Math.sqrt(P*(P- P12)*(P-P23)*(P-P13));
	    System.err.println("S "+S);
	    double R = P12*P23*P13/(4*S);
	    System.err.println("R "+R);

	    double A = Math.acos((P12*P12 + P13*P13 - P23*P23) / (2 * P12 * P13));
	    double B = Math.acos((P13*P13 + P23*P23 - P12*P12) / (2 * P13 * P23));
	    double C = Math.acos((P12*P12 + P23*P23 - P13*P13) / (2 * P12 * P23));
        
        
        System.err.println(A+" "+B+" "+C);
	    	int N = (int) Math.ceil(Math.PI/gcd(A, B, C));
	    	System.err.println(N);
        
        double answer = N/ 2* R*R*Math.sin(2*Math.PI/N);
        if(N == 3) answer = P12*p13*P23/Math.sqrt((P12+P13+P23)*(P13+P23-P12)*(P13+P12-P23)*(P12+P23-P13));
        System.out.printf("%.8f%n", answer);
	   
	    //System.out.printf("%.8f%n", N/(2*R*R*(Math.sin(2*Math.PI/N))));
	}
	
	public static double gcd(double x, double y, double z) {
	    return gcd(gcd(x, y), z);
	}

	public static double gcd(double x, double y) {
	    while (Math.abs(x) > eps && Math.abs(y) > eps) {
	        if (x > y)
	                x -= Math.floor(x / y) * y;
	        else
	                y -= Math.floor(y / x) * x;
	    }

	    return x + y;
	}
}