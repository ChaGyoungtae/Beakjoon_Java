import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();

		Set<Integer> set = new HashSet<>();


		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++){
			setA.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < b; i++){
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		
		set.addAll(setA);
		set.removeAll(setB);
		cnt += set.size();

		set.clear();
		set.addAll(setB);
		set.removeAll(setA);
		cnt += set.size();

		System.out.println(cnt);
	}
}