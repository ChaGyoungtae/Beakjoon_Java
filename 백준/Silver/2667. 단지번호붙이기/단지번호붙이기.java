import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] visited;
    static int[][] matrix;
    static int sum;

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
        if(j == matrix.length-1){
            arr[3] = 0;
        }

        return arr;
    }


    public static void dfs(int i, int j){
        visited[i][j] = 1;
        sum++;

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

        StringTokenizer st;
        int a = Integer.parseInt(br.readLine()); // 정점 개수

        matrix = new int[a][a];
        visited = new int[a][a];

        for (int i = 0; i < a; i++) {
            String str = br.readLine();
            for (int j = 0; j < a; j++) {
                matrix[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }


        int cnt = 0;
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                if(matrix[i][j] == 1 && visited[i][j] == 0){

                    //System.out.println(i + " " + j);

                    cnt++;
                    dfs(i, j);
                    num.add(sum);
                    sum = 0;

                }
            }
        }

        Collections.sort(num);
        System.out.println(cnt);
        for(int i = 0; i <num.size(); i++){
            System.out.println(num.get(i));
        }
    }
}