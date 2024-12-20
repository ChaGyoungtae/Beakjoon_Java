import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String str = new String();
        for (int i =0; i<t; i++){
            str = br.readLine();
            System.out.println(str.charAt(0) +""+ str.charAt(str.length()-1));
        }
    }
}