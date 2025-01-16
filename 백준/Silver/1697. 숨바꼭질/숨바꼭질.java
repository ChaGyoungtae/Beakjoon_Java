import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 나
        int b = Integer.parseInt(st.nextToken()); // 동생

        /*
        b 로 가려면
            1. b + 1 / 2. b - 1 /  b / 2 중에서 가장 빠른길로 와야함
         */
        int current = a; // 내 위치
        int[] memo = new int[100001];
        int cnt = 0;
        Deque<List<Integer>> dq = new ArrayDeque<>();
        List<Integer> init = new ArrayList<>();
        init.add(a);
        init.add(cnt);
        dq.offer(init);

        while(!dq.isEmpty()){
            List<Integer> tmp = dq.poll();
            current = tmp.get(0);

            
            if(current > 100000 || current < 0) continue;
            if(memo[current] == 1) continue;

            
            //System.out.println(dq);
            memo[current] = 1;
            cnt = tmp.get(1);
            if(current == b) {
                System.out.println(cnt);
                break;
            }
            else {
                cnt ++;
                if((current * 2) > (b * 2) + 1 ){
                    dq.offer(new ArrayList<Integer>(Arrays.asList(current+1, cnt)));
                    dq.offer(new ArrayList<Integer>(Arrays.asList(current-1, cnt)));
                } else {
                    dq.offer(new ArrayList<Integer>(Arrays.asList(current + 1, cnt)));
                    dq.offer(new ArrayList<Integer>(Arrays.asList(current - 1, cnt)));
                    dq.offer(new ArrayList<Integer>(Arrays.asList(current * 2, cnt)));
                }
            }

        }

    }
}