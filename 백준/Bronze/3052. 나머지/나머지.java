import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[42];
        for (int i = 0; i < 42; i++) {
            arr[i] = 0;
        }

        int t = 0;
        for (int i = 0; i < 10; i++) {
            t = Integer.parseInt(br.readLine());
            arr[t % 42] = 1;
        }

        int cnt = 0;

        for (int i = 0; i < 42; i++) {
            if (arr[i] == 1) {
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}