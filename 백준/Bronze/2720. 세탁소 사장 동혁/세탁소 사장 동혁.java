import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a = 0;

        for(int i = 0; i<t; i++){
             a = Integer.parseInt(br.readLine());
            System.out.print(a/25 + " ");
            a = a%25;
            System.out.print(a/10 + " ");
            a = a%10;
            System.out.print(a/5 + " ");
            a = a%5;
            System.out.println(a);
        }


    }

}


