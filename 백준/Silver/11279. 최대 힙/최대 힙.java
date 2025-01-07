import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;


class Main {

	public static void main(String[] args) throws Exception {

		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int tmp = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<t; i++){
			tmp = Integer.parseInt(br.readLine());
			if(tmp == 0){
				if(pq.isEmpty()){
					sb.append(0);
				} else {
					sb.append(pq.poll());
				}
				sb.append("\n");
			} else {
				pq.add(tmp);
			}
		}
		System.out.println(sb.toString());
	}
}