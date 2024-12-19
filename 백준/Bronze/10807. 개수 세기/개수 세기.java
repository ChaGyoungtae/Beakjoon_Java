import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < t; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i =0; i < t; i++){
            if (list.get(i) == v) {
                cnt ++;
            }
        }

        System.out.println(cnt);




    }

}