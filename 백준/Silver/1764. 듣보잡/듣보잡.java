import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> hashMap = new HashSet<>();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for(int i = 0; i<a; i++){
			hashMap.add(br.readLine());
		}
		int cnt =0;
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		for(int i = 0; i<b; i++){
			String tmp = br.readLine();
			if(hashMap.contains(tmp)){
				cnt++;
				list.add(tmp);
			}
		}
		System.out.println(cnt);
		Collections.sort(list);

		for(String e : list){
			System.out.println(e);
		}
	}
}