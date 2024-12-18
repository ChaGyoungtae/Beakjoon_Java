import javax.print.DocFlavor;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a * b > 0) {
            if(a > 0) {
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        } else {
            if(a > 0) {
                System.out.println(4);
            } else {
                System.out.println(2);
            }
        }
    }

}