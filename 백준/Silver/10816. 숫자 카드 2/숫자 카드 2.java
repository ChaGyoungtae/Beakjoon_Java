import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i<t; i++){
			int tmp = Integer.parseInt(st.nextToken());
			if(!hashMap.containsKey(tmp)){
				hashMap.put(tmp, 1);
			} else {
				hashMap.put(tmp, hashMap.get(tmp) + 1);
			}
		}

		t = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<t; i++){
			Integer answer = Optional.ofNullable(hashMap.get(Integer.parseInt(st.nextToken()))).orElse(0);
			sb.append(answer).append(" ");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.close();
	}
}