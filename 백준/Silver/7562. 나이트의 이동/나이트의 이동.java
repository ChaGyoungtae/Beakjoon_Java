import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        int[] dy = {-1,-2,-2,-1,1,2,2,1};
        int[] dx = {-2,-1,1,2,-2,-1,1,2};


        for(int i = 0; i<t; i++){
            int n = Integer.parseInt(br.readLine()); // 체스판 한 변의 길이
            int[][] matrix = new int[n][n];

            int[] start = new int[2];
            int[] end = new int[2];

            StringTokenizer st = new StringTokenizer(br.readLine());
            start[0] = Integer.parseInt(st.nextToken());
            start[1] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            end[0] = Integer.parseInt(st.nextToken());
            end[1] = Integer.parseInt(st.nextToken());

            Deque<int[]> dq = new ArrayDeque<>();
            dq.offer(start);

            for(int[] row : matrix){
                Arrays.fill(row,-1);
            }

            matrix[start[0]][start[1]] += 1;

            int cnt = 0;
            while(!dq.isEmpty()){
                int[] tmp = dq.poll();
                int y = tmp[0];
                int x = tmp[1];

                if(y == end[0] && x == end[1]){
                    System.out.println(matrix[y][x]);
                    break;
                }

                /*
                 현재 내 위치가 i,j 인경우
                 (i - 1), (j - 2) / (i - 2), (j - 1)
                 (i - 2), (j + 1) / (i - 1), (j + 2)
                 (i + 1), (j - 2) / (i + 2), (j - 1)
                 (i + 2), (j + 1) / (i + 1), (j + 2)
                 */
                for(int j = 0; j<8; j++){
                    int ny = y+dy[j];
                    int nx = x+dx[j];

                    if(ny < 0 || ny >= n) continue; // 체스판 벗어나지 않게
                    if(nx < 0 || nx >= n) continue; // 체스판 벗어나지 않게

                    if(matrix[ny][nx] != -1) continue; // 되돌아가지 않게
                    matrix[ny][nx] = matrix[y][x] + 1;
                    dq.offer(new int[]{ny, nx});
                }
            }
        }
    }
}