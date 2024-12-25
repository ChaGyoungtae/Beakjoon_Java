import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static boolean[] isPrime(int n){
        boolean [] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(arr[i]){
                for(int j = i*i; j<= n; j+=i){
                    arr[j] = false;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] arr= isPrime(N);

        int sum = 0;
        int cnt = 0;
        int min = 0;

        for(int i = M; i<=N; i++){
            if(arr[i]){
                sum += i;
                cnt ++;
                if(cnt == 1) min = i;
            }
        }
        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }





    }
}


