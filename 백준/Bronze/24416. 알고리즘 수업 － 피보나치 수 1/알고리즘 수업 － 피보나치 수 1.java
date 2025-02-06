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
	static int recur_cnt;
	public static int fibo(int n){
		if(n < 3) {
			recur_cnt++;
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] fibo = new int[N+1];
		fibo[1] = 1;
		fibo[2] = 1;

		int dp_cnt = 0;
		recur_cnt = 0;

		fibo(N);

		for(int i = 3; i<N+1; i++){
			dp_cnt++;
			fibo[i] = fibo[i-1] + fibo[i - 2];
		}


		System.out.println(recur_cnt + " " + dp_cnt);



	}
}