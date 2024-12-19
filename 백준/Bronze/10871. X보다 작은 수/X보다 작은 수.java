import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(st2.nextToken()));
        }

        StringBuilder sb = new StringBuilder();

        for(int i =0; i < n; i++){
            if (list.get(i) < x) {
                sb.append(list.get(i)).append(" ");
            }
        }

        System.out.println(sb.toString());




    }

}