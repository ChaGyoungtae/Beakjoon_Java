import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();

		for(int i = 1; i <= t; i++){
			q.offer(i);
		}

		for(int i = 0; i<t; i++) {
			if(q.size() == 1){
				System.out.println(q.peek());
				break;
			}
			q.poll();
			q.offer(q.poll());
		}
	}
}