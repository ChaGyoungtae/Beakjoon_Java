import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        int fibot = t - 1;

        String a = " ";
        String b = "*";



        for(int i = 0; i < t; i++){

            System.out.print(a.repeat(fibot));
            System.out.print(b.repeat(t - fibot));
            fibot -= 1;
            System.out.println();
        }
    }

}