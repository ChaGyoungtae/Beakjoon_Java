import javax.print.DocFlavor;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int b1 = Integer.parseInt(b.substring(0,1));
        int b2 = Integer.parseInt(b.substring(1,2));
        int b3 = Integer.parseInt(b.substring(2,3));
        System.out.println(a * b3);
        System.out.println(a * b2);
        System.out.println(a * b1);
        System.out.println(a * Integer.parseInt(b));
    }

}