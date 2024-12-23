import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];


        String str = new String();
        int max = 0;
        for(int i = 0; i<5; i++){
            str = br.readLine();
            for(int j = 0; j<str.length();j++){
                arr[i][j] = str.charAt(j);
            }
        }
        int n = 0;

        for(int j = 0; j<15; j++){
            for(int i = 0; i<5; i++){
                n = arr[i][j];
                if( (n >= 48 && n <= 57) || (n >= 65 && n <= 91) || (n >= 97 && n <= 123) ) {
                    System.out.print(arr[i][j]);
                } else {
                    continue;
                }
            }
        }





    }

}


