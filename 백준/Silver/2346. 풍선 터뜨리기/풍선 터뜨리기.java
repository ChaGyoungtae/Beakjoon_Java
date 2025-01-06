import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a;
		int b = 0;
		List<Integer> arr = new ArrayList<>();

		Deque<Integer> deque = new ArrayDeque<>();
		for(int i = 1;i<= t; i++){
			deque.offer(i);
		}

		int[] nums = new int[t+1];
		for(int i = 1; i<t+1; i++){
			nums[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 1;i <= t; i++){
			a = nums[deque.peekFirst()];
			arr.add(deque.pollFirst());
			if(deque.isEmpty()){
				break;
			}

			if(a > 0) {
				for(int j = 1; j<a; j++){

					deque.offerLast(deque.pollFirst());

				}
			} else {
				a = Math.abs(a);
				for(int j = 0; j<a; j++){

					deque.offerFirst(deque.pollLast());

				}
			}
		}

		for(int i = 0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}

	}
}