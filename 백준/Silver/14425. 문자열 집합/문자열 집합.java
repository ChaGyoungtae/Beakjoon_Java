import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		Set<String> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for(int i = 0; i<a; i++){
			set.add(br.readLine());
		}
		int cnt = 0;
		for(int i = 0; i<b; i++){
			if(set.contains(br.readLine())) cnt++;
		}

		System.out.println(cnt);
	}
}