import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String str;
		String c;
		Stack<String> stack = new Stack<>();

		for(int i = 0; i<t; i++){
			str = br.readLine();
			for(int j = 0; j<str.length();j++){
				c = str.substring(j,j+1);
				if(c.equals("(")){
					stack.push(c);
				} else {
					if(!stack.isEmpty()) stack.pop();
					else{
						System.out.println("NO");
						break;
					}
				}

				if(j == str.length()-1){
					if(stack.isEmpty()){
						System.out.println("YES");
					} else {
					System.out.println("NO");
			}
				}
			}
			stack.clear();
		}
	}
}