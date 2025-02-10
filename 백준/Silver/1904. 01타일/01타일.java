import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[1000001];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3; i<= N; i++){
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}

		System.out.println(arr[N]);
	}
}
	/* 0이 없고 00만 만들수있다. (n-1) + 1
	1 -> 1 = 1
	2 -> 00 , 11 = 2
	3 -> 100, 001 / 111, = 3
	4 -> 0000, 1100, 1001, (1001), 0011 / 1111, (1111) = 6 - 2 + 1
	5 -> 10000, 00001, 11100, 11001, (11001), 10011, (10011), 00111, 11111, (11111) = 10 - 3
	6 -> 000000,
		 110000, 100001,
	 	(100001), 000011,
	 	 111100, 111001,
	 	(111001), 110011,
	 	(110011), 100111,
	 	(100111), 001111,
	 	 111111, (111111) = 14 - 5 + 1 = 10
	7 -> 1000000, 0000001
		 1110000, 1100001,
		 1100001, 1000011,
		 1000011, 0000111,
		 1111100, 1111001,
		 1111001, 1110011,
		 1110011, 1100111,
		 1100111, 1001111,
		 1001111, 0011111,
		 1111111, 1111111 = 20 - 7 = 13

	짝수인경우 -> 1111 + 0000 생김 -> +2
	홀수인경우 -> 11111 만 생김 -> +1
	 */
