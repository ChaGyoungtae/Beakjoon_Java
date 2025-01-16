import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dy = {-1,1,0,0};
        int[] dx = {0,0,-1,1};

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 새로
        int m = Integer.parseInt(st.nextToken()); // 가로
        int[][] matrix = new int[m][n];

        List<int[]> welldone = new ArrayList<>();


        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(matrix[i][j] == 1){
                    welldone.add(new int[]{i,j});
                }
            }
        }

        Deque<int[]> dq = new ArrayDeque<>();

        for(int i = 0; i< welldone.size(); i++){
            dq.offer(welldone.get(i));
        }
        while(!dq.isEmpty()){
            int[] tmp = dq.poll();
            int y = tmp[0];
            int x = tmp[1];

            for(int j = 0; j<4; j++){
                int ny = y+dy[j];
                int nx = x+dx[j];

                if(ny < 0 || ny >= m) continue; // 체스판 벗어나지 않게
                if(nx < 0 || nx >= n) continue; // 체스판 벗어나지 않게

                if(matrix[ny][nx] != 0) continue; // 되돌아가지 않게
                matrix[ny][nx] = matrix[y][x] + 1;
                dq.offer(new int[]{ny, nx});
            }
        }
        int max = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    System.out.println(-1);
                    return ;
                }
                else{
                    if(matrix[i][j] > max){
                        max = matrix[i][j];
                    }
                }
            }
        }
        System.out.println(max-1);
    }
}