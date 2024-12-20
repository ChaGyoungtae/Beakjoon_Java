import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Double> list = new ArrayList<>();

        for(int i = 0; i<t; i++){
            list.add(Double.parseDouble(st.nextToken()));
        }

        Collections.sort(list);
        Double max = list.get(list.size()-1);
        Double sum = 0.0;
        for(int i = 0; i<t; i++){
            list.set(i, list.get(i) / max * 100);
            sum += list.get(i);
        }
        System.out.println(sum / t);

    }
}