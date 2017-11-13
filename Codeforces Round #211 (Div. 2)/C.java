import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEroui
 */
public class C {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] arr = in.next().toCharArray();
            char[] ans = new char[arr.length];
            int cur = 0;
            for (int i = 0; i < arr.length; ++i) {
                if (cur < 2) ans[cur++] = arr[i];
                else {
                    if (ans[cur - 1] == arr[i] && arr[i] == ans[cur - 2])
                        continue;
                    if (ans[cur - 1] == arr[i]) {
                        if (cur < 3) ans[cur++] = arr[i];
                        else {
                            char c1 = ans[cur - 3];
                            char c2 = ans[cur - 2];
                            if (c1 == c2) continue;
                            else ans[cur++] = arr[i];
                        }
                    } else
                        ans[cur++] = arr[i];
                }
            }

            out.println((new String(ans)).trim());
        }

    }
}