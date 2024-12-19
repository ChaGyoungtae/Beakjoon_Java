import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = i+1;
            }

        StringTokenizer st2;
        int j = 0;
        int k = 0;

        int tmp = 0;
        for (int i = 0; i < m; i++) {
            st2 = new StringTokenizer(br.readLine());
            j = Integer.parseInt(st2.nextToken()) - 1;
            k = Integer.parseInt(st2.nextToken()) - 1;
            for(int o = j; o <= (k+j) / 2; o++) {    // 1 2 -> swap(0,1) 3 4 -> swap(2,3) 1 4 -> swap(0,3), swap(1,2), 2 5 -> swap(1,4), swap(2,3)
                tmp = arr[o];
                arr[o] = arr[k - (o-j)];
                arr[k - (o-j)] = tmp;
            }


        }
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}