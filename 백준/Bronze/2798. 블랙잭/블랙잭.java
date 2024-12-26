import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        List<Integer> sum = new ArrayList<>();
        int tmp = 0;
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N; i++){
            tmp = arr[i];
            for(int j = i+1; j<N; j++){
                tmp += arr[j];
                for(int k = j+1; k<N; k++){
                    tmp += arr[k];
                    sum.add(tmp);
                    tmp -= arr[k];
                }
                tmp -= arr[j];
            }
        }
        int min_idx = 0;
        int min = sum.get(0);
        for(int i = 1; i<sum.size();i ++){
            if(M-sum.get(i) < min && M-sum.get(i) >= 0){
                min = M-sum.get(i);
                min_idx = i;
           }
        }
        System.out.println(sum.get(min_idx));
        





    }
}


