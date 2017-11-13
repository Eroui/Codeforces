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

            int[] arr = new int[n + 1];

            for (int i = 1; i <= n; ++i) {
                arr[i] = in.nextInt();
            }


            int ans = arr[k];
            int left = k - 1;
            int right = k + 1;

            while (left >= 1 || right <= n) {

                if (left >= 1 && right <= n) {
                    ans += arr[left] + arr[right] == 2 ? 2 : 0;
                } else if (left >= 1) {
                    ans += arr[left];
                } else if (right <= n)
                    ans += arr[right];


                --left;
                ++right;
            }

            out.println(ans);
        }

    }
}
