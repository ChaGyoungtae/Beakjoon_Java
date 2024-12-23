import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;



public class Main {
    public static int[][] setVisited(int[][] arr, int a, int b){
        for(int i = b; i<b+10; i++){
            for(int j = a; j<a+10; j++){
                arr[i][j] = 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] visited = new int[100][100];

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;


        int a = 0;
        int b = 0;
        for(int i =0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            visited = setVisited(visited, a, b);
        }

        int cnt = 0;
        for(int i =0; i<100; i++){
            for(int j = 0; j<100; j++){
                //System.out.print(visited[i][j]+ " ");
                if(visited[i][j] == 1) cnt ++;
            }
            //System.out.println();
        }

        System.out.println(cnt);





    }

}


