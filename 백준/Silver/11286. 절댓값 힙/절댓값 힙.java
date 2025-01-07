import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {

	public static void main(String[] args) throws Exception {

		PriorityQueue<Integer> pq1 = new PriorityQueue();
		PriorityQueue<Integer> pq2 = new PriorityQueue(Collections.reverseOrder());


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int tmp = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<t; i++){
			tmp = Integer.parseInt(br.readLine());
			if(tmp == 0){
				if(pq1.isEmpty() && pq2.isEmpty()) sb.append(0);
				else if(pq1.isEmpty()){
					sb.append(pq2.poll());
				} else if(pq2.isEmpty()) {
					sb.append(pq1.poll());
				} else {
					if( Math.abs(pq1.peek()) < Math.abs(pq2.peek())) {
						sb.append(pq1.poll());
					} else {
						sb.append(pq2.poll());
					}
				}

				sb.append("\n");
			} else {
				if(tmp < 0){
					pq2.add(tmp);
				} else {
					pq1.add(tmp);
				}
			}
		}
		System.out.println(sb.toString());
	}
}