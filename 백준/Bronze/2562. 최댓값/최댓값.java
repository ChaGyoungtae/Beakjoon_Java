import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int max_idx = 0;
        int tmp = 0;
        for (int i = 1; i <= 9; i++){
            tmp = Integer.parseInt(br.readLine());
            if(max <= tmp) {
                max = tmp;
                max_idx = i;

            }
        }
        System.out.println(max);
        System.out.println(max_idx);





    }

}