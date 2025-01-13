import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static HashMap<Integer, List<Integer>> graph = new HashMap<>();
    static int[] visited;
    static int cnt;
    static Queue<Integer> q = new LinkedList<>();

    public static void bfs(int idx){
        if(visited[idx] == 0){
            //System.out.println(idx);
            visited[idx] = 1;
            q.offer(idx);

            while (!q.isEmpty()){
                int current = q.poll();
                for (int near : graph.get(current)) {
                    if(visited[near] == 0){
                        visited[near] = 1;
                        cnt++;
                        q.offer(near);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()); // 정점 개수
        int b = Integer.parseInt(br.readLine()); // 간선 개수
        StringTokenizer st;



        visited = new int[a+1];



        for(int i = 0; i<a; i++){
            graph.put(i + 1, new ArrayList<>());
        }

        for(int i = 0; i<b; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        bfs(1);

        System.out.println(cnt);
    }
}
