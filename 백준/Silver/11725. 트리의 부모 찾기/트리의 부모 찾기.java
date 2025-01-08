import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


class Main {
   public static void main(String[] args) throws Exception {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int t = Integer.parseInt(br.readLine());
      int[] visited = new int[t+1];
      HashMap<Integer,List<Integer>> tree = new HashMap();

	  for(int i = 1; i<=t; i++){
		  tree.put(i,new ArrayList<>());
	   }

	  for(int i = 1 ; i<t; i++){
         StringTokenizer st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());

		 tree.get(a).add(b);
		 tree.get(b).add(a);
	  }

	  int[] parant = new int[t + 1];
	  Arrays.fill(parant,-1);
	   Queue<Integer> q = new LinkedList<>();
	   q.add(1);
	   parant[1] = 0; // 루트노드 추가

	   while (!q.isEmpty()) { // BFS를 통한 부모노드 찾기
		   int current = q.poll();
		   for(int child : tree.get(current)){
			   if(parant[child] == -1){ // 아직 부모가 설정되지 않은 노드는
				   parant[child] = current; // 부모를 설정해준다.
				   q.add(child);
			   }
		   }
	   }

	   for(int i = 2; i<=t; i++){
		   System.out.println(parant[i]);
	   }


   }
}