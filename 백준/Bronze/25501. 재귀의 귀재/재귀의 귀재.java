import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    static int cnt;
    static int sw;

    public static void isPalindrome(String str) {
        cnt++;
        if (str.length() < 2) {
            sw = 1;
            return;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            sw = 0;
            return;
        }

        isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            cnt = 0;
            sw = 0;
            isPalindrome(br.readLine());
            System.out.println(sw + " " + cnt);
        }
    }
}
