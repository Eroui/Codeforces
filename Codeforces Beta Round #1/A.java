import java.util.*;


/**
 * @Author Eroui Abdelaziz <kapi.abdel@gmail.com>
 * @veridc: Accepted
 */


public class A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        
        long  a = in.nextLong();
        
        
        if(m%a == 0) m = m/a;
        else m = m/a +1;
        
        if(n%a == 0) n = n/a;
        else n = n/a +1;
        
        System.out.println(m*n);
        
    }
    
}