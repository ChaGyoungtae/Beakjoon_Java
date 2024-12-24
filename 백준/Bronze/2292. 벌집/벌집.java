import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /*
        1 - 1
        2 ~ 7 - 2
        8 ~ 19 - 3
        20 ~ 38 - 4
         */
        int cnt = 1;
        int a = 1;
        for(int i = 1; a < t; i++){
            a += (6 * i);
            cnt++;

        }
        System.out.println(cnt);



    }

}


