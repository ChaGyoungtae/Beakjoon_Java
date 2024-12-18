import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        a /= 4;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a; i++){
            sb.append("long ");
        }

        sb.append("int");
        System.out.println(sb.toString());
    }

}