import java.util.*;
import java.io.*;


// class TestClass
public class C {

    public static void main(String args[] ) throws Exception {
        Kattio in = new Kattio(System.in);
      	
      	int V = in.nextInt();
      	int E = in.nextInt();

      	boolean[] vis = new boolean[V+1];
       	long[] dis = new long[V+1];
       	int[] prev = new int[V+1];

       	for(int i = 0; i < V; i++) {
       		adjList[i] = new Vector<Pair>();
       		dis[i] = Long.MAX_VALUE;
       		prev[i] = i;
       	}

      	Vector<Pair>[] adjList = new Vector[V+1];
      	for(int i = 0; i < E; i++) {
      		int u = in.nextInt();
      		int v = in.nextInt();
      		double w = in.nextLong();
      		
      		adjList[u].add(new Pair(u, w));
      		adjList[v].add(new Pair(v, w));
       	}


       	ArrayDeque<Pair> q = new ArrayDeque<Pair>();
       	q.offer(new Pair(1, 0));



       	double ans = Double.MAX_VALUE;

       	while(!q.isEmpty()) {

       		Pair state = q.poll();
       		int u = state.f;
       		double d = state.s;

       		if(u == V) {
       			ans = d;
       			break;
       		}

       		if(vis[u]) continue;
       		vis[u] = true;

       		if(adjList[u] == null) continue;
       		for(Pair p: adjList[u]) {
       			int v= p.f;
       			double w = p.s;


       			q.offer(new Pair(v, d+w));
       		}

       	}

       	if(ans == Double.MAX_VALUE) System.out.println(-1);
       	else System.out.println(ans);




        in.flush();
        in.close();
 	}

 	private static class Kattio extends PrintWriter {

	    private BufferedReader r;
	    private String line;
	    private StringTokenizer st;
	    private String token;
		
	    public Kattio(InputStream i) {
			super(new BufferedOutputStream(System.out));
			r = new BufferedReader(new InputStreamReader(i));
	    }
	    public Kattio(InputStream i, OutputStream o) {
			super(new BufferedOutputStream(o));
			r = new BufferedReader(new InputStreamReader(i));
	    }

	    public boolean hasNext() {
	    	return peekToken() != null;
	    }

	    public int nextInt() {
	    	return Integer.parseInt(nextToken());
	    }

	    public double nextDouble() { 
	    	return Double.parseDouble(nextToken());
	    }

	    public long nextLong() {
	    	return Long.parseLong(nextToken());
	    }

	    public String next() {
	    	return nextToken();
	    }
	    
	    public String nextLine() {
	    	token = null;
	    	st = null;
	    	try {
	    		return r.readLine();
	    	} catch (IOException e) {
	    		return null;
	    	}
	    }

	    private String peekToken() {
			if (token == null) 
			    try {
					while (st == null || !st.hasMoreTokens()) {
					    line = r.readLine();
					    if (line == null) return null;
					    st = new StringTokenizer(line);
					}
					token = st.nextToken();
			    } catch (IOException e) { }
			return token;
	    }

	    private String nextToken() {
			String ans = peekToken();
			token = null;
			return ans;
	    }
	}
}

class Pair {
	int f;
	double s;

	public Pair(int f, double s) {
		this.f = f;
		this.s = s;
	}
}

class Triple implements Comparable<Triple>{
	int f, s, t;

	public Triple(int f, int s ,int t) {
		this.f = f;
		this.s = s;
		this.t = t;
	}

	@Override
	public int compareTo(Triple t) {
		return this.t - t.t;
	}
}