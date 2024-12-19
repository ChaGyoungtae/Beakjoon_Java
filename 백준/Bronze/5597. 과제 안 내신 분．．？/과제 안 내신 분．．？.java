import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];
        for (int i = 1; i <= 30; i++) {
            arr[i] = 0;
        }

        int t = 0;
        for (int i = 0; i < 28; i++) {
            t = Integer.parseInt(br.readLine());
            arr[t] = 1;
        }



        for (int i = 1; i <= 30; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}