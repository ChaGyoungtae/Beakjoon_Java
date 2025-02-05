import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		Set<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i]);
		}
		Integer[] arr2 = new Integer[set.size()];
		set.toArray(arr2);
		Arrays.sort(arr2);

		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<arr2.length; i++){
			map.put(arr2[i], i);
		}

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i<arr.length; i++){
			sb.append(map.get(arr[i]) + " ");
		}

		System.out.println(sb);



	}
}