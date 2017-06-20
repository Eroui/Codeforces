import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
 * @verdic AC
 */
public class E {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            if (n == 1) {
                out.println(0);
            } else if (n == 2) {
                out.println(1);
                out.println(1 + " " + 2);
            } else if (n == 3) {
                out.println(2);
                out.println(1 + " " + 2);
                out.println(2 + " " + 3);
            } else {
                out.println((n / 2) * (n / 2 + (n % 2)));
                out.println(1 + " " + 2);
                out.println(2 + " " + 3);
                for (int i = 4; i <= n; ++i) {
                    out.println((i - 1) + " " + i);
                }

                for (int i = 1; i <= n; ++i) {
                    for (int j = (i + 3); j <= n; j += 2) {
                        out.println(i + " " + j);
                    }
                }
            }

        }

    }
}

