import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static int fibonacci(int n){
        if(n <= 0){
            return 0;
        }

        else if(n == 1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(t));
    }
}


