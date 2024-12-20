import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int t = 0;
        int sum = 0;
        for(int i = 0; i<str.length();i++){
            t = str.charAt(i) - '0';
            sum += t;
        }
        System.out.println(sum);
    }
}