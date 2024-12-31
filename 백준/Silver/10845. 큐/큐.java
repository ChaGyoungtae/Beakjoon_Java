import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Main {
	public static void main(String[] args) throws Exception {

		Queue q = new LinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String order;
		int value;
		int prev = 0;
		for(int i = 0; i<t; i++){
			st = new StringTokenizer(br.readLine());
			order = st.nextToken();
			if(order.equals("push")){
				value = Integer.parseInt(st.nextToken());
				q.offer(value);
				prev = value;
			} else if (order.equals("pop")){
				if(q.isEmpty()){
					System.out.println(-1);
				} else {
					System.out.println(q.poll());
				}
			} else if (order.equals("size")){
				System.out.println(q.size());
			} else if (order.equals("empty")){
				if(q.isEmpty()){
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (order.equals("front")){
				if(q.isEmpty()){
					System.out.println(-1);
				} else {
					System.out.println(q.peek());
				}
			} else {
				if(q.isEmpty()){
					System.out.println(-1);
				} else {
					System.out.println(prev);
				}
			}
		}
	}
}