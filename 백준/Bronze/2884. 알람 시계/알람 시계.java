import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (b < 45) {
            b += 60;
            a -= 1;
            if (a < 0) {
                a += 24;
            }
        }
        b -= 45;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a)).append(" ").append(String.valueOf(b));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.newLine();
        bw.close();
    }

}