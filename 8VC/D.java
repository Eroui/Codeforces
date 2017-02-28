    import java.util.*;
    import java.io.*;
    import java.math.*;


    public class D {
      public static void main(String[] args) {
        Kattio in = new Kattio(System.in);
        int n = in.nextInt(), k = in.nextInt(), last = 1, next = 1, step = 1;
        k = Math.min(k, n-k);



        int tmp = 1;
          
        long ans = 1;
        StringBuilder sb = new StringBuilder();


          for(int i = 0; i < n; i++) {
             next = last + k;
             if(next > n) {
              next -= n;

                ans += (step+1);
                step +=2;
              
              
             } else {
               ans += step;
             }

                sb.append(i == n-1 ? ans-1 : ans);
                sb.append(' ');

              last= next;
          }

          in.println(sb.toString());
          in.flush();
          in.close();
      }

      static private class Kattio extends PrintWriter {

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