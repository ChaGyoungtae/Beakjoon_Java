import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int a;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i<t; i++){
			a = Integer.parseInt(br.readLine());
			if(a == 0){
				stack.pop();
			} else {
				stack.push(a);
			}
		}
		int sum = 0;
		int size = stack.size();
		for(int i = 0; i<size;i++){
			sum += stack.pop();
		}

		System.out.println(sum);
	}
}