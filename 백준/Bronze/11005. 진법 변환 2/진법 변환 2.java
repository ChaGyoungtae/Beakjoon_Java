import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String c = Integer.toString(a,b).toUpperCase(Locale.ROOT);
        System.out.println(c);
    }

}


