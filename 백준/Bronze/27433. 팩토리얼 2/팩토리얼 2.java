import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static Long factorial(int n){

        if(n <= 1){
            return 1L;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        System.out.println(factorial(t));
    }
}


