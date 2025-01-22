import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int m;
    static StringBuilder sb;
    static int[] arr;

    public static void btc(int at, int depth){
        if(depth == m){
            for(int e: arr){
                sb.append(e).append(' ');
            }
            sb.append("\n");
            return;
        }

        for(int i = at; i <= n; i++){
            arr[depth] = i;
            btc(i, depth+1);
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        // 1 부터 N 까지 중복없이 count개 를 고른 수열
        arr = new int[m];
        btc(1, 0);


        System.out.println(sb.toString());

    }
}
