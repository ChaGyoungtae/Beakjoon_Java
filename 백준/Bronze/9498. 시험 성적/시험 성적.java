import javax.print.DocFlavor;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(br.readLine());

        if(b >= 90 && b <= 100) {
            System.out.println("A");
        } else if (b >= 80) {
            System.out.println("B");
        } else if (b >= 70){
            System.out.println("C");
        } else if (b >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}