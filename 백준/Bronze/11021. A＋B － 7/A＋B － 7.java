import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 1; i <= t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i +": " + String.valueOf(a+b));
            bw.newLine();
        }
        bw.close();
    }

}