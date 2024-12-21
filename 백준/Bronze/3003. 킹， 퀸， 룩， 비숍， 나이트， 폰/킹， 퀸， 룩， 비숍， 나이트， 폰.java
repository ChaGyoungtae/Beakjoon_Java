import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr1 = {1,1,2,2,2,8};
        int[] arr2 = new int[6];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<6; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
            System.out.print(arr1[i] - arr2[i] + " ");
        }
    }
}