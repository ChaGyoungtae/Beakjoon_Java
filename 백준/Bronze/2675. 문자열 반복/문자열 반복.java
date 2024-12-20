import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int a;
        String str;
        String tmp;
        char c;
        for(int i =0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for(int j=0;j<str.length();j++){
                tmp = String.valueOf(str.charAt(j));
                System.out.print(tmp.repeat(a));
            }
            System.out.println();


        }

    }
}