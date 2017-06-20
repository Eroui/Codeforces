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
            String mail = in.next();

            if (mail.startsWith("dot")) {
                out.print("dot");
                mail = mail.substring(3);
            } else if (mail.startsWith("at")) {
                out.print("at");
                mail = mail.substring(2);
            }

            mail = mail.replace("dot", ".");
            mail = mail.replaceFirst("at", "@");
            if (mail.endsWith(".")) {
                out.print(mail.substring(0, mail.length() - 1));
                out.println("dot");
            } else
                out.println(mail);
        }

    }
}

