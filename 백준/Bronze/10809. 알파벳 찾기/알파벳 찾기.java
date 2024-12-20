import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        char c;
        int j;
        for (int i = 0; i<str.length();i++){
            c = str.charAt(i);
            j = (int) c - 'a';
            if(arr[j] == -1) {
                arr[j] = i;
            }

        }

        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}