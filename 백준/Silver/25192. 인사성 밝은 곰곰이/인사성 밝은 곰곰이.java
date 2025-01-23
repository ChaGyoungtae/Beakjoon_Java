import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int cnt = 0;
        for(int i = 0; i<t; i++){
            String tmp = br.readLine();
            if(!tmp.equals("ENTER")) set.add(tmp);
            else {
                cnt += set.size();
                set.clear();
            }
        }

        System.out.println(cnt += set.size());

    }
}
