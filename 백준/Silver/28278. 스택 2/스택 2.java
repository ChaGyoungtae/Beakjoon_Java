import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st;
		int a = 0;
		int b = 0;
		for(int i = 0; i<t; i++){
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			if(a == 1){
				b = Integer.parseInt(st.nextToken());
				stack.push(b);
			} else if (a == 2) {
				if(!stack.empty()){
					System.out.println(stack.pop());
				} else {
					System.out.println(-1);
				}
			} else if (a == 3){
				System.out.println(stack.size());
			} else if (a == 4){
				if(!stack.empty()){
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else {
				if(!stack.empty()){
					System.out.println(stack.peek());
				} else {
					System.out.println(-1);
				}
			}
		}
	}
}