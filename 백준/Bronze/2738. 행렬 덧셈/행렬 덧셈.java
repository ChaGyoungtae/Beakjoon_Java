import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];

        for (int i = 0; i < arr1.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken()) + arr1[i][j];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }
    }

}


