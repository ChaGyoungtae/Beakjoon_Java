import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int m;
    static boolean[] visited;
    static int[] sequence;
    static int start;

    public static void btc(int num){
        if(num == m){
            for(int e : sequence){
                System.out.print(e + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i<= n; i++){
            if(!visited[i]){
                sequence[num] = i;
                visited[i] = true;
                btc(num + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        // 1 부터 N 까지 중복없이 count개 를 고른 수열

        visited = new boolean[n+1];
        sequence = new int[m];

        btc(0);
    }
}
