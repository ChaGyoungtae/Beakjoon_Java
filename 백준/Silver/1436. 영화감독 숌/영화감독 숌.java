import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int i = 666;
        int cnt = 0;
        String str;
        while(true){
            str = String.valueOf(i);
            if(str.contains("666")){
                cnt++;
                if(cnt == t){
                    System.out.println(str);
                    break;
                }
            }
            i++;
        }


    }
}


