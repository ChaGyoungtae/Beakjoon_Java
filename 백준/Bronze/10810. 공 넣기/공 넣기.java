import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            list.add(0);
        }
        StringTokenizer st2;

        int l = 0;
        int j = 0;
        int k = 0;

        for(int i = 0; i < m; i++){
            st2 = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st2.nextToken());
            j = Integer.parseInt(st2.nextToken());
            k = Integer.parseInt(st2.nextToken());

            for(int o = l-1; o < j; o ++){
                list.set(o,k);
            }

        }

        for(int i = 0; i<n; i++){
            System.out.print(list.get(i) + " ");
        }


    }

}