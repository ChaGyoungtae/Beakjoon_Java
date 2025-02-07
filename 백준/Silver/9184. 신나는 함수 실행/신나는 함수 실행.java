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
	static int[][][] memo;
	static boolean isEnd(int a, int b, int c){
        return a == -1 && b == -1 && c == -1;
    }
	static boolean containLessThanZero(int a, int b, int c){
		if(a <= 0 || b <= 0 || c<= 0){
			return true;
		}
		return false;
	}
	static void setMemo() {
		for(int i = 0; i <= 20; i++){
			for(int j = 0; j <= 20; j++){
				for(int l = 0;l <= 20; l++){
					if(i == 0 || j == 0 || l == 0){
						memo[i][j][l] = 1;
					}
					else if(i < j && j < l) {
						memo[i][j][l] = memo[i][j][l - 1] + memo[i][j - 1][l - 1] - memo[i][j - 1][l];
					} else {
						memo[i][j][l] = memo[i-1][j][l] + memo[i-1][j-1][l] + memo[i-1][j][l-1] - memo[i-1][j-1][l-1];
					}
				}
			}
		}

		for(int i = 1; i <= 50; i++){
			for(int j = 1; j<=50; j++) {
				for (int l = 1; l <= 50; l++) {
					if(i > 20 || j > 20 || l > 20) memo[i][j][l] = memo[20][20][20];
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[3];
		memo = new int[51][51][51];
		setMemo();
		StringBuilder sb;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			sb = new StringBuilder();
			sb.append(a + ", " + b + ", " + c);
			if(isEnd(a,b,c)) return;
			if(containLessThanZero(a,b,c)){
				System.out.println("w("+sb+") = " + 1);
				continue;
			}
			System.out.println("w("+sb+") = " + memo[a][b][c]);
		}
	}
}