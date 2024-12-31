import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st;
		String c;
		Stack<String> stack = new Stack<>();


		while (true){
			stack.clear();

			st = br.readLine();

			if(st.equals(".")){
				return;
			}
			for(int i = 0; i<st.length();i++){
				c = String.valueOf(st.charAt(i));
				if(c.equals("(") || c.equals("[")){
					stack.push(c);
				} else if (c.equals(")")){
					if(!stack.isEmpty() && stack.peek().equals("(")){
						stack.pop();
					} else {
						System.out.println("no");
						break;
					}
				} else if (c.equals("]")){
					if(!stack.isEmpty() && stack.peek().equals("[")){
						stack.pop();
					} else {
						System.out.println("no");
						break;
					}
				}

				if(i == st.length()-1){
					if(stack.isEmpty()){
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				}
			}
		}
	}
}