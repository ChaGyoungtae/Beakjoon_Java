import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] matrix;
    static int a;
    static int b;


    public static void bfs(int x,int y) {
	    Queue<List<Integer>> q = new LinkedList<>();

        int[] dx = new int[]{-1,1,0,0};
        int[] dy = new int[]{0,0,-1,1};

        List<Integer> tmp = new ArrayList<>();
        tmp.add(x);
        tmp.add(y);
        q.offer(tmp);

        while(!q.isEmpty()) {
            List<Integer> current = q.poll();
            x = current.get(0);
            y = current.get(1);

            int nx = 0;
            int ny = 0;
            for (int i = 0; i < 4; i++) {
                nx = x + dx[i];
                ny = y + dy[i];


                if (nx < 0 || nx >= a || ny < 0 || ny >= b) {
                    continue;
                }

                if (matrix[nx][ny] == 0){
                    continue;
                }

                if (matrix[nx][ny] == 1){
                    matrix[nx][ny] = matrix[x][y] + 1;
                    List<Integer> tmp2 = new ArrayList<>();
                    tmp2.add(nx);
                    tmp2.add(ny);

                    q.offer(tmp2);
                }
            }
        }
}

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken()); // 끝 점
        b = Integer.parseInt(st.nextToken()); // 끝 점

        matrix = new int[a][b];

        for(int i = 0; i<a; i++){
            String str = br.readLine();
            for(int j = 0; j<b; j++){
                matrix[i][j] = (str.charAt(j) - '0');
            }
        }

        bfs(0,0);

        System.out.println(matrix[a - 1][b - 1]);

    }
}