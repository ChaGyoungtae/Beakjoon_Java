import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;

		StringBuilder sb = new StringBuilder();

		Queue q = new LinkedList<>();
		String order;
		int prev = 0;
		for(int i = 0; i<t; i++){
			st = new StringTokenizer(br.readLine());
			order = st.nextToken();
			if(order.equals("push")){
				prev = Integer.parseInt(st.nextToken());
				q.offer(prev);

			} else if (order.equals("pop")) {
				if(!q.isEmpty()){
					sb.append(q.poll());
				} else {
					sb.append(-1);
				}
				sb.append("\n");
			} else if (order.equals("size")) {
				sb.append(q.size()).append("\n");
			} else if (order.equals("empty")) {
				if(q.isEmpty()){
					sb.append(1);
				} else {
					sb.append(0);
				}
				sb.append("\n");
			} else if (order.equals("front")) {
				if(q.isEmpty()){
					sb.append(-1);
				} else {
					sb.append(q.peek());
				}
				sb.append("\n");
			} else if (order.equals("back")) {
				if(q.isEmpty()){
					sb.append(-1);
				} else {
					sb.append(prev);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}