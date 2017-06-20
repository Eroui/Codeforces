import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
 * @verdic AC
 */
public class A {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            System.out.println(isReversed(in.next(), in.next()) ? "YES" : "NO");
        }

        public boolean isReversed(String s, String ss) {
            if (reverse(s).equals(ss)) return true;
            return false;
        }

        public String reverse(String s) {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }

    }
}

