import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int tmp = 0;
        int i = 1;

        List<Integer> arr = new ArrayList<>();

        while (i <= N){
            String s_tmp = String.valueOf(i);
            tmp += i;
            for(int j = 0; j<s_tmp.length(); j++){
                arr.add(Integer.parseInt(s_tmp.substring(j, j + 1)));
                tmp += arr.get(j);
            }
            if(tmp == N){
                tmp = i;
                break;
            }
            i ++;
            arr.clear();
            tmp = 0;
        }
        System.out.println(tmp);





    }
}


