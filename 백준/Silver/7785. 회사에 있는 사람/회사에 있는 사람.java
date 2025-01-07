import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();


		String name;
		String status;

		for(int i = 0; i<t; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			status = st.nextToken();
			if(status.equals("enter")){
				set.add(name);
			} else {
				if(status.equals("leave")) {
					set.remove(name);
				}
			}
		}
		List<String> result = new ArrayList<>(set);
		Collections.sort(result, Collections.reverseOrder());

		for(int i = 0; i<result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}