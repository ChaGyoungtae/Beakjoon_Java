import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[100001];
		int max = 0;
		for(int i = 1; i<=n; i++){
			int tmp = Integer.parseInt(st.nextToken());
			if(i == 1){
				arr[i] = tmp;
				max = tmp;
			}
			else {
				if(tmp < 0){
					if(arr[i-1] + tmp <= 0){
						arr[i] = tmp;
						max = Math.max(max,tmp);
					} else {
						arr[i] = arr[i-1] + tmp;
						max = Math.max(arr[i], max);
					}

				} else {
					if(arr[i-1] > 0) {
						arr[i] = arr[i - 1] + tmp;
						max = Math.max(arr[i], max);
					} else{
						arr[i] = tmp;
						max = Math.max(arr[i],max);
					}
				}
			}
//			System.out.print(arr[i] + " ");
//			System.out.print("max : " + max);
//			System.out.println();
		}
		//System.out.println();
		System.out.println(max);
	}
}
