import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            if(str.length() >= m){
                if(!map.containsKey(str)){
                    map.put(str,1);
                } else {
                    map.put(str,map.get(str) + 1);
                }
            }
        }
        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(!Objects.equals(map.get(o1), map.get(o2))){
                    return (map.get(o2) - map.get(o1));
                }
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }

                return o1.compareTo(o2);

            }
        });

        StringBuilder sb = new StringBuilder();
        for(String str : words){
            sb.append(str + "\n");
        }
        System.out.println(sb);

    }
}
