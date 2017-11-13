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
 */
public class B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            int min = Integer.MAX_VALUE;
            int mini = -1;

            int sum = 0;
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                arr[i] = in.nextInt();
                sum += arr[i];

                if (i >= k) {
                    sum -= arr[i - k];
                    if (min > sum) {
                        min = sum;
                        mini = i - k + 1;
                    }
                }
            }

            if (min > sum) {
                min = sum;
                mini = n - k + 1;
            }

            out.println(mini);
        }

    }
}