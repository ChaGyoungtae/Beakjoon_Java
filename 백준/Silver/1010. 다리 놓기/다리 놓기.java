import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    public static void makeBridge(int n, int m){
        long a = 1L;
        long b = 1L;
        long result = 1L;
        for(int i = 0; i < n; i++){
            result *= (m - i);
            result /= (i+1);
        }

        System.out.println(result);


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // 4, 7 인경우
            // 4 + 3 + 2 + 1 / 3 + 2 + 1 / 2 + 1 / 1


            //3, 5 인 경우
            // 3 + 2 + 1 / 2 + 1 / 1

            // 5, 8인 경우
            // 4 + 3 + 2 + 1

            //
            makeBridge(n, m);
        }



    }
}
