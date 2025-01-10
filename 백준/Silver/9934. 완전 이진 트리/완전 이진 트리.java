import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static List<List<Integer>> tree = new ArrayList<>();

    public static void makeTree(List<Integer> arr, int mid, int level) {

        tree.get(level).add(arr.get(mid));

        List<Integer> left = arr.subList(0, mid);
        List<Integer> right = arr.subList(mid + 1, arr.size());

        if (left.size() == 1) {
            left = arr.subList(0, mid);
            tree.get(level+1).add(left.get(0));
            right = arr.subList(mid + 1, arr.size());
            tree.get(level+1).add(right.get(0));
            return ;
        }

        makeTree(left, left.size() / 2, level+1);
        makeTree(right, right.size() / 2, level+1);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            tree.add(new ArrayList<>());
        }

        int size = 0;
        int cnt = 0;
        while (cnt < t){
            size += (int) Math.pow(2, cnt);
            cnt++;
        }

        for(int i = 0; i<size; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int mid = arr.size() / 2;

        makeTree(arr, mid, 0);

        for(List<Integer> lst : tree){
            for(int e : lst){
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }
}
