import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int a = Integer.parseInt(st.nextToken());
        Long sum = 0L;
        int tmp;
        for(int i = 0; i<str.length();i++){
            tmp = str.charAt(str.length()-1-i);
            if(tmp >= 65) tmp -= 55;
            else tmp -= 48;
            sum += Long.valueOf((tmp) * (int)Math.pow(a,i));
        }


        System.out.println(sum);


    }

}


