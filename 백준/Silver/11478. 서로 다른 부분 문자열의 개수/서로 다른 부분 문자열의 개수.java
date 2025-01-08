import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String tmp;
		Set<String> set = new HashSet<>();
		int size = 1;
		while (size <= str.length()) {
			for(int i = 0; i<=str.length() - size; i++){ // 집합의 원소 개수가 size 인 부분 집합 구하기
				set.add(str.substring(i, i + size));
			}
			size++;
		}

		System.out.println(set.size());
	}
}