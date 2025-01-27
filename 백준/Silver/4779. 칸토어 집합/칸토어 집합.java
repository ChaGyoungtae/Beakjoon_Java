import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    static int a;
    static StringBuilder sb;
    static int size;
    static String str2;
    static void cantor(String str, int size){
        if(size == 1){
            //sb.append(str);
            return;
        }
        int middle = size / 3;
        String left = str.substring(0, middle); // 8 > 0,1,2  3,4,5  6,7,8
        String right = str.substring(middle+middle-1, str.length()-1);

        String tmp = " ";
        str = left + tmp.repeat(middle) + right;
        if(left.length() == 1){
            sb.append(str);
        }


        cantor(left,middle);
        if(middle != 1){
            sb.append(tmp.repeat(middle));
        }
        cantor(right,middle);


    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "-";
        String n = "";
        while((n = br.readLine()) != null){
            sb = new StringBuilder();
            a = Integer.parseInt(n);
            size = (int) Math.pow(3, a);
            str2 = str.repeat((int) Math.pow(3, a));
            if(a == 0){
                sb.append("-");
            } else {
                cantor(str2, size);
            }
            System.out.println(sb);
        }
    }
}
