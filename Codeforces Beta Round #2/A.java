import java.util.*;
import java.lang.*;
import java.io.*;


/**
 *  @Author : Eroui Abdelaziz <kapi.abdel@gmail.com>
 *  12/10/2016
 *  Verdic : WA on 6
 */


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Pair> m = new HashMap<String, Pair>();
		
		for(int i = 0; i  < n; i++) {
		    String name = in.next();
		    long score = in.nextLong();
		    
		    if(m.containsKey(name)) {
		        Pair pp = new Pair(m.get(name).f + score, i);
		        m.put(name, pp);
		    }else {
		        m.put(name, new Pair(score, i));
		    }
		}
		
		long max = Long.MIN_VALUE;
		int maxr = -1;
		Set<String> s = m.keySet();
		String ans = "";
		for(String tmp: s) {
		    Pair pp = m.get(tmp);
		    long pps = pp.f;
		    int ppr = pp.s;
		    
		    if(max < pps) {
		        max = pps;
		        ans = tmp;
		        maxr = ppr;
		    }else if(max == pps) {
		        if(maxr > ppr) {
		            maxr = ppr;
		            max = pps;
		            ans = tmp;
		        }
		    }
		}
		
		System.out.println(ans);
	}
}

class Pair {
    long f;
    int s;
    
    public Pair(long f, int s) {
        this.f = f;
        this.s = s;
    }
    
}
