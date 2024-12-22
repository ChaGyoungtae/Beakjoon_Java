import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        int[] arr = new int[26];


        int idx = 0;

        int cnt = 0;
        char curr = ' ';
        for(int i = 0; i<t; i++){
            Arrays.fill(arr,-1);
            String str = br.readLine();
            for(int j = 0; j<str.length(); j++){
                idx = str.charAt(j) - 'a';
                if(arr[idx] == -1){
                    arr[idx] = 1;
                    curr = str.charAt(j);
                }
                else if(arr[idx] != -1 && str.charAt(j) == curr){
                    arr[idx] = 1;
                } else if (arr[idx] != -1) {
                    break;
                }

                if(j == str.length()-1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}