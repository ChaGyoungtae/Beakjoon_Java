import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int c;
		int s = 1;

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<t; i++){
			if(!stack2.isEmpty()){
				if(s == stack2.peek()){
				stack1.push(stack2.pop());
				i--;
				s++;
				continue;
				}
			}
			c = Integer.parseInt(st.nextToken());
			if(s == c) {
				stack1.push(c);
				s++;
			} else {
				stack2.push(c);
			}
		}
		int size = stack2.size();
		for(int i = 0; i<size;i ++){
			stack1.push(stack2.pop());
		}
		size = stack1.size();
		for(int i = 0; i<size; i++){
			if(stack1.pop() != t){
				break;
			}
			t--;
		}
		if(stack1.isEmpty()){
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
	}
}