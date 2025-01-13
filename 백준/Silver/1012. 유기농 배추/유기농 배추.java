import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] visited;
    static int[][] matrix;

    public static int[] check(int i, int j){
        int[] arr = new int[]{1, 1, 1, 1};
        if(i == 0){
            arr[0] = 0;
        }
        if(j == 0){
            arr[1] = 0;
        }
        if(i == matrix.length-1){
            arr[2] = 0;
        }
        if(j == matrix[0].length-1){
            arr[3] = 0;
        }

        return arr;
    }

    public static void dfs(int i, int j){
        visited[i][j] = 1;

        int[] check = check(i, j);

        if(check[0] == 1 && visited[i-1][j] == 0 && matrix[i-1][j] == 1){
            dfs(i-1, j);
        }
        if (check[1] == 1 && visited[i][j-1] == 0 && matrix[i][j-1] == 1){
            dfs(i,j-1);
        }
        if (check[2] == 1 && visited[i+1][j] == 0 && matrix[i+1][j] == 1){
            dfs(i + 1, j);
        }
        if (check[3] == 1 && visited[i][j+1] == 0 && matrix[i][j+1] == 1){
            dfs(i,j+1);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 가로
            int b = Integer.parseInt(st.nextToken()); // 새로
            int c = Integer.parseInt(st.nextToken()); // 배추 위치

            matrix = new int[b][a];
            visited = new int[b][a];

            for(int j = 0; j<c; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                matrix[y][x] = 1;
            }
            int cnt = 0;
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < a; k++) {
                    if(matrix[j][k] == 1 && visited[j][k] == 0){
                        //System.out.println(j + " " + k);
                        cnt++;
                        dfs(j, k);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}