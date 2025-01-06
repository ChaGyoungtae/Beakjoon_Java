import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		for(int i = 1; i<=a; i++){
			q.offer(i);
		}

		while(!q.isEmpty()){
			for(int i = 0; i<b; i++){
				if(i == b-1){
					result.add(q.poll());
					break;
				}
				q.offer(q.poll());
			}
		}
		System.out.print("<");
		for(int i = 0; i<result.size(); i++){
			if(i == result.size()-1){
				System.out.println(result.get(i) + ">");
				break;
			}
			System.out.print(result.get(i) + ", ");
		}
	}
}