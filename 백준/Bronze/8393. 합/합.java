import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1 ; i <= a ; i ++){
            sum += i;
        }
        System.out.println(sum);


    }

}