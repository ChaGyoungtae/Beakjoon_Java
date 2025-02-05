import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class Main {
	static class Member{
		public String name;
		public int age;
		public int order;

		Member(int age,String name,int order) {
			this.age = age;
			this.name = name;
			this.order = order;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Member[] arr = new Member[N];
		for(int i = 0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken(), i);
		}

		Arrays.sort(arr, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.age != o2.age ? o1.age - o2.age : o1.order - o2.order;
			}
		});

		for(int i = 0 ; i< N; i++){
			System.out.println(arr[i].age + " " + arr[i].name);
		}
	}
}