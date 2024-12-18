import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;

        int sum = 0;
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sum += (a * b);
        }

        if(total == sum) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}