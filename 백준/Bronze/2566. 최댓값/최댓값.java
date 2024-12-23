import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        int max = 0;
        int max_idx_i = 0;
        int max_idx_j = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(max <= arr[i][j]){
                    max = arr[i][j];
                    max_idx_i = i;
                    max_idx_j = j;
                }
            }
        }
        System.out.println(max);
        System.out.print(max_idx_i+1);
        System.out.print(" ");
        System.out.print(max_idx_j+1);

    }

}


