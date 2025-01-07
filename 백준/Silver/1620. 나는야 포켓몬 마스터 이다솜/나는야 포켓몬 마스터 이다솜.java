import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
	public static boolean isInt(String str){
		try{
			int a = Integer.parseInt(str);
		} catch (NumberFormatException e){
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int t2 = Integer.parseInt(st.nextToken());

		Map<Integer,String> hashMap1 = new HashMap<>();
		Map<String,Integer> hashMap2 = new HashMap<>();


		String answer;

		for(int i = 1; i<=t; i++){
			answer = br.readLine();
			hashMap1.put(i, answer);
			hashMap2.put(answer,i);

		}

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i<t2; i++) {
			answer = br.readLine();
			if (isInt(answer)) {
				Integer ianswer = Integer.parseInt(answer);
				sb.append(hashMap1.get(ianswer)).append("\n");
			} else {
				sb.append(hashMap2.get(answer)).append("\n");
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.newLine();
		bw.close();
	}
}