import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] memo = new int[5001];
        memo[0] = -1;
        memo[1] = -1;
        memo[2] = -1;
        memo[3] = 1;
        memo[4] = -1;
        memo[5] = 1;

        if(t < 5){
            System.out.println(memo[t]);
            return;
        }

        for(int i = 6; i<=t; i++){
            if(memo[i -3] < 0 && memo[i-5] <0){
                memo[i] = -1;
            } else if(memo[i-3] > 0 && memo[i-5] >0) {
                if(memo[i-3] < memo[i-5]){
                    memo[i] = memo[i-3] + 1;
                } else {
                    memo[i] = memo[i-5] + 1;
                }
            } else if (memo[i-3] >0 ) {
                memo[i] = memo[i-3] + 1;
            } else {
                memo[i] = memo[i-5] + 1;
            }
        }

        System.out.println(memo[t]);
    }
}


