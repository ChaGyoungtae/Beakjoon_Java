import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static boolean getResult(int x, int y){
        int top = 0;
        int bottom = 0;
        top = a*x + b*y;
        bottom = d*x + e*y;
        if(top == c && bottom == f){
            return true;
        } else{
            return false;
        }
    }
    static int a,b,c,d,e,f;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            f = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();

        for(int i =-999; i<1000; i++){
            for(int j =-999; j<1000;j++){
                if (getResult(i, j)) {
                    if(arr.size() == 2){
                        arr.clear();
                        break;
                    }
                    else {
                        arr.add(i);
                        arr.add(j);
                    }
                }
            }
        }
        if(arr.size() == 2) {
            System.out.println(arr.get(0) + " " + arr.get(1));
        }




    }
}


