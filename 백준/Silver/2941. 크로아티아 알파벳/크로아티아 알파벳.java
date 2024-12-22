import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int[] arr_visited = new int[str.length()];
        int cnt = 0;
        int idx = 0;
        int f= 0;
        for(int i = 0; i<str.length();i++){
            sb.append(str.charAt(i));
            for(int j = 0; j<arr.length;j++){
                idx = sb.toString().indexOf(arr[j],f);
                //System.out.println(sb.toString());
                if(idx != -1){

                  if(j == 2 && arr_visited[idx] != 1) {

                      for(int k = idx; k<=idx+2; k++) {
                          arr_visited[k] = 1;
                          f= idx+3;
                      }
                      cnt ++;
                  } else if (arr_visited[idx] != 1) {

                      for(int k = idx; k<=idx+1; k++) {
                          arr_visited[k] = 1;
                          f = idx+2;
                      }
                      cnt ++;

                  }
                    //System.out.println("cnt : " + cnt);
                }


//                  for(int l =0; l<arr_visited.length; l++){
//                      System.out.print(arr_visited[l] + " ");
//                  }
//                    System.out.println();
            }
        }

        for(int i =0; i<str.length(); i++){
            if(arr_visited[i] != 1) cnt++;
        }
        System.out.println(cnt);
    }
}