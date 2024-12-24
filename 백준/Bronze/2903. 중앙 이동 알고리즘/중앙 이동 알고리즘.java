import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int result = 4;

        for(int i =1; i<=t; i++){
            result = (  result * 4) - ((int)(Math.sqrt(result) - 1) * 4 + 3);
        }
        System.out.println(result);



    }

}


