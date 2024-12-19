import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i ++){
            list.add(i);
        }
        StringTokenizer st2;

        int j = 0;
        int k = 0;
        int tmp = 0;
        for(int i = 0; i < m; i++){
            st2 = new StringTokenizer(br.readLine());
            j = Integer.parseInt(st2.nextToken()) - 1;
            k = Integer.parseInt(st2.nextToken()) - 1;

            tmp = list.get(j);
            list.set(j,list.get(k));
            list.set(k, tmp);

        }

        for(int i = 0; i<n; i++){
            System.out.print(list.get(i) + " ");
        }


    }

}