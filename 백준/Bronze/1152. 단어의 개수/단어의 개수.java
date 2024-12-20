import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i =0;

        while (true){
            if(st.hasMoreTokens() == false){
                break;
            } else {
                i ++;
                st.nextToken();
            }
        }

        System.out.println(i);
    }
}