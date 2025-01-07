import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;


class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[] a = new int[t];
		List<Integer> b = new ArrayList<>();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		for(int j = 0; j<t; j++){
			a[j] = Integer.parseInt(st.nextToken());
		}
		int tmp = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		for(int j = 0; j<t; j++){
			tmp = Integer.parseInt(st.nextToken());
			if(a[j] == 0){
				b.add(tmp);
			}
		}

		for(int i = b.size()-1; i >= 0; i--){
			deque.offerFirst(b.get(i));
		}


		StringBuilder sb = new StringBuilder();

		int t2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<t2; i++){
			tmp = Integer.parseInt(st.nextToken());
			deque.offerFirst(tmp);
			sb.append(deque.pollLast()).append(" ");
		}


		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.newLine();
		bw.close();

	}
}