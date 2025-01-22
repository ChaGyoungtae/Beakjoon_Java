import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    static int t;
    static int result;
    static int[] nums;
    static int[] operators;
    static int[] answers;
    static List<Integer> oper;
    static int[] tmp;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void sequence(){
        oper = new ArrayList<>();

        for(int i = 0; i<4; i++){
            if(operators[i] > 0){
                int n = operators[i];
                for(int j = 0; j<n; j++){
                    oper.add(i);
                }
            }
        }
        tmp = new int[oper.size()];
        visited = new boolean[oper.size()];

        btc(0);
        calculate();
    }

    static void calculate(){
        StringTokenizer line = new StringTokenizer(sb.toString());
        int cnt = 0;
        while(line.hasMoreTokens()){
            result = nums[0];
            for(int i = 1; i <= oper.size(); i++){
                String operator = line.nextToken();
                if(operator.equals("0")){
                    result += nums[i];
                } else if (operator.equals("1")) {
                    result -= nums[i];
                } else if (operator.equals("2")) {
                    result *= nums[i];
                } else {
                    if(result < 0){
                        result = result * (-1);
                        result /= nums[i];
                        result = result * (-1);
                    } else {
                        result /= nums[i];
                    }

                }
            }
            if(cnt == 0){
                answers[0] = result;
                answers[1] = result;
                cnt++;
            } else {
                if(result >= answers[0]) answers[0] = result;
                if(result <= answers[1]) answers[1] = result;
            }
        }
    }


    public static void btc(int depth){
        if(depth == oper.size()){
            for(int e: tmp){
                sb.append(e).append(' ');
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < oper.size(); i++){
            if(!visited[i]) {
                tmp[depth] = oper.get(i);
                visited[i] = true;
                btc(depth + 1);
                visited[i] = false;
            }
        }

    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        nums = new int[t];

        for(int i = 0; i<t; i++){

            nums[i] = Integer.parseInt(st.nextToken());
        }

        operators = new int[4];
        answers = new int[2];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<4; i++){
            operators[i] = Integer.parseInt(st.nextToken());
        }

        sequence();

        System.out.println(answers[0]);
        System.out.println(answers[1]);



    }
}
