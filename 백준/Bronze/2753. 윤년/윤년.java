import javax.print.DocFlavor;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(br.readLine());

        if ((b % 4 == 0 && b % 100 != 0) || b % 400 == 0 ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}