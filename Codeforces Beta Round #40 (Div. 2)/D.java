import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
 * @verdic AC
 */
public class D {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int n;
        int m;
        int k;
        int[][] grid;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            k = in.nextInt();

            grid = new int[n][m];
            int[][][] dp = new int[n][m][k + 1];
            int[][][] parent = new int[n][m][k + 1];
            char[][][] pchar = new char[n][m][k + 1];

            for (int i = 0; i < n; ++i) {
                char[] arr = in.next().toCharArray();
                for (int j = 0; j < m; ++j) {
                    Arrays.fill(dp[i][j], Integer.MIN_VALUE);
                    grid[i][j] = arr[j] - '0';

                    if (i == n - 1) {
                        dp[i][j][grid[i][j] % (k + 1)] = grid[i][j];
                    }
                }
            }

            for (int i = n - 1; i > 0; --i) {
                for (int j = 0; j < m; ++j) {
                    for (int mod = 0; mod <= k; ++mod) {

                        if (j < m - 1) {
                            int nmod = (mod + grid[i - 1][j + 1]) % (k + 1);
                            if (dp[i][j][mod] != Integer.MIN_VALUE && dp[i][j][mod] + grid[i - 1][j + 1] > dp[i - 1][j + 1][nmod]) {
                                dp[i - 1][j + 1][nmod] = dp[i][j][mod] + grid[i - 1][j + 1];
                                parent[i - 1][j + 1][nmod] = mod;
                                pchar[i - 1][j + 1][nmod] = 'R';
                            }
                        }

                        if (j > 0) {
                            int nmod = (mod + grid[i - 1][j - 1]) % (k + 1);
                            if (dp[i][j][mod] != Integer.MIN_VALUE && dp[i][j][mod] + grid[i - 1][j - 1] > dp[i - 1][j - 1][nmod]) {
                                dp[i - 1][j - 1][nmod] = dp[i][j][mod] + grid[i - 1][j - 1];
                                parent[i - 1][j - 1][nmod] = mod;
                                pchar[i - 1][j - 1][nmod] = 'L';
                            }
                        }
                    }
                }
            }

            int maxVal = Integer.MIN_VALUE;
            int idx = -1;
            for (int j = 0; j < m; ++j) {
                if (maxVal < dp[0][j][0]) {
                    idx = j;
                    maxVal = dp[0][j][0];
                }
            }

            if (maxVal == Integer.MIN_VALUE) {
                out.println(-1);
                return;
            }

            out.println(maxVal);
            String ans = "";
            int curx = 0, cury = idx, curm = 0;
            int start = 0;

            while (pchar[curx][cury][curm] == 'L' || pchar[curx][cury][curm] == 'R') {
                ans = pchar[curx][cury][curm] + ans;
                int tmpm = parent[curx][cury][curm];
                if (pchar[curx][cury][curm] == 'R')
                    --cury;
                else
                    ++cury;

                ++curx;
                curm = tmpm;
            }

            out.println(cury + 1);
            out.println(ans);

        }

    }
}

