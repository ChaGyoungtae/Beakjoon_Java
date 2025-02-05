import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();
		for(int i = 0; i<N; i++){
			set.add(br.readLine());
		}
		String[] arr = new String[set.size()];
		set.toArray(arr);
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() != o2.length() ? o1.length() - o2.length() : o1.compareTo(o2);
			}
		});
		Arrays.stream(arr).forEach(System.out::println);
	}
}