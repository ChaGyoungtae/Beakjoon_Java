import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int a = Integer.parseInt(br.readLine());
            if(a == -1) break;
            List<Integer> arr = new ArrayList<>();
            int sum = 0;
            for(int i = 1; i<a; i++){
                if(a % i == 0){
                    arr.add(i);
                    sum += i;
                }
            }

            if(sum == a) {
                System.out.print(a + " = ");
                for(int i = 0; i < arr.size(); i++){
                    if(i == arr.size()-1) {
                        System.out.println(arr.get(i));
                        break;
                    }
                    System.out.print(arr.get(i) + " + ");
                }
            }
            else {
                System.out.println(a + " is NOT perfect.");
            }
        }




    }
}


