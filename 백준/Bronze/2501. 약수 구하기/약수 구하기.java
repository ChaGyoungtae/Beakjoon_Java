import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = 0;
        int cnt = 0;
        for(int i = 1; i<=a; i++){
            if(a % i == 0){
                result = i;
                cnt ++;
                if(cnt == b) break;
            }

        }
        if(cnt < b) result = 0;
        System.out.println(result);
    }
}


