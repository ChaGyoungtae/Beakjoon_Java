import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();


        int sw = 0;

        if(string.length() == 1){

            System.out.println(1);
            return;
        }

        for (int i =0 ; i<string.length() / 2; i++){

            if(string.charAt(i) != string.charAt(string.length()-1-i)) break;

            if(i == string.length() /2 -1) {
                sw = 1;
            }
        }
        System.out.println(sw);
    }
}