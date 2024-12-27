import javax.naming.PartialResultException;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;



public class Main {

    public static int getResult(int a, int b){

        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        int[] arr1_cnt = new int[2];
        int[] arr2_cnt = new int[2];

        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                if (((i + 1) + (j + 1)) % 2 == 1) {
                    arr1.add(arr[i][j]);
                    if (arr1.get(arr1.size() - 1).equals("B")) {
                        arr1_cnt[0]++;
                    } else arr1_cnt[1]++;
                } else {
                    arr2.add(arr[i][j]);
                    if (arr2.get(arr2.size() - 1).equals("B")) {
                        arr2_cnt[0]++;
                    } else {
                        arr2_cnt[1]++;
                    }
                }
            }
        }
        // B 로 시작
        int result1 = arr1_cnt[1] + arr2_cnt[0];

        // W 로 시작
        int result2 = arr1_cnt[0] + arr2_cnt[1];

        if(result1 < result2) {
            return result1;
        } else {
            return result2;
        }
    }
    static String[][] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String str;
        List<Integer> answer = new ArrayList<>();
        arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.substring(j,j+1);
            }
        }

        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                answer.add(getResult(i,j));
            }
        }

        System.out.println(Collections.min(answer));


    }
}


