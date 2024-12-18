import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int sum = 0;

        for(int i = 1; i<= t; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}