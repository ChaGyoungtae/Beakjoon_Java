import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) < 97) sb.append( (char) (str.charAt(i) + ' '));
            else sb.append(str.charAt(i));
        }
        String lowerStr = sb.toString();
        int a = 0;
        for(int i = 0; i < lowerStr.length(); i++){
            a = lowerStr.charAt(i) - 97;
            arr[a] += 1;
        }
        int max = 0;
        int max_idx = 0;

        for(int i = 0; i< 26; i++){
            if(max < arr[i]){
                max = arr[i];
                max_idx = i;
            }
        }



        for(int i = 0;  i<26 ; i++){
            if(arr[i] == max && i != max_idx) max = -1;
        }

        if(max == -1) System.out.println('?');
        else System.out.println( (char) (max_idx + 65));
    }
}