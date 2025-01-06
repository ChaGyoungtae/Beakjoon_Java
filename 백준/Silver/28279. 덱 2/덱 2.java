import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		StringTokenizer st;

		int a;
		int b;
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i = 0; i<t; i++){
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());

			switch (a) {
				case 1:
					b = Integer.parseInt(st.nextToken());
					deque.addFirst(b);
					break;
				case 2:
					b = Integer.parseInt(st.nextToken());
					deque.addLast(b);
					break;
				case 3:
					if(!deque.isEmpty()){
						sb.append(deque.pollFirst());
					} else {
						sb.append(-1);
					}
					sb.append("\n");
					break;
				case 4:
					if(!deque.isEmpty()){;
						sb.append(deque.pollLast());
					} else {
						sb.append(-1);
					}
					sb.append("\n");
					break;
				case 5:
					sb.append(deque.size());
					sb.append("\n");
					break;
				case 6:
					if(deque.isEmpty()){
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append("\n");
					break;
				case 7:
					if(!deque.isEmpty()){;
						sb.append(deque.peekFirst());
					} else {
						sb.append(-1);
					}
					sb.append("\n");
					break;
				case 8:
					if(!deque.isEmpty()){;
						sb.append(deque.peekLast());
					} else {
						sb.append(-1);
					}
					sb.append("\n");
					break;
			}
		}

		System.out.println(sb.toString());
	}
}