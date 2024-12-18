import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = 0;
        int max = 0;

        if (a == b) {
            if (a == c) {  // a = b = c
                result = 10000 + (a * 1000);
            } else {        // a = b != c
                result = 1000 + (a * 100);
            }
        } else if (a == c) {  // a = c != b
            result = 1000 + (a * 100);
        } else if (b == c) {
            result = 1000 + (b * 100);
        } else {
            if (a > b) {
                if (a > c) {
                    max = a;
                } else {
                    max = c;
                }
            } else {
                if (b > c) {
                    max = b;
                } else {
                    max = c;
                }
            }
            result = max * 100;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.close();
    }

}