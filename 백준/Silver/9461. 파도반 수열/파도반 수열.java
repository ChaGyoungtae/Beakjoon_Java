import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long[] arr = new Long[101];
		arr[1] = 1L;
		arr[2] = 1L;
		arr[3] = 1L;
		arr[4] = 2L;
		arr[5] = 2L;
		for(int i = 6; i<= 100; i++){
			arr[i] = arr[i-1] + arr[i-5];
		}
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N; i++){
			System.out.println(arr[Integer.parseInt(br.readLine())]);
		}
	}
}
/*
	1 - 1
	2 - 1
	3 - 1
	4 - 1 + 1
	5 - arr[4]
	6 - 1 + 2
	7 -
 */
