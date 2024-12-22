import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] grade_arr = {"D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"};

        float result = 0;
        StringTokenizer st;
        String title;
        double score;
        String grade;
        double sg = 0.0;
        double max = 0.0;
        for(int i = 0; i<20; i++){
            st = new StringTokenizer(br.readLine());
            title = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            grade = st.nextToken();
            sg = 0.0;
            for(int j = 0; j< grade_arr.length; j++){
                if(grade.equals("F")){
                    max += score;
                    break;
                } else if (grade.equals("P")) {
                    break;
                } else {
                    if(grade_arr[j].equals(grade)){
                        // 0 : 1, 1: 1.5
                        sg = 1.0 + (0.5 * (double) j);
                        result += score * sg;
                        max += score;
                        break;
                    }
                }
            }
            }
        result = result / (float) max;
        System.out.println(result);

        }





}