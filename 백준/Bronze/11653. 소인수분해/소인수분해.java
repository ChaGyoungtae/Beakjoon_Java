import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        if(M == 1) return;

        for(int i = 2;i<=M;i++){
            while (M % i == 0){
                System.out.println(i);
                M /= i;
            }

        }





    }
}


