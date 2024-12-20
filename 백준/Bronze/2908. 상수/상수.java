import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        int a = 0;
        int b = 0;
        for(int i = 2; i>=0; i--){
            a += (str1.charAt(i)-'0')  * (int) Math.pow(10,i);
            b += (str2.charAt(i)-'0') * (int) Math.pow(10,i);
        }
        if(a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        
    }
}