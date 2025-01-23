import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<t; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i<t; i++){
            sum += arr[i];
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            } else {
                map.put(arr[i],map.get(arr[i]) + 1);
            }
        }
        int mode = 0;
        int key = 0;
        List<Integer> modes = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > mode){
                mode = entry.getValue();
                key = entry.getKey();
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == mode){
                modes.add(entry.getKey());
            }
        }
        Collections.sort(modes);
        if(modes.size() > 1){
            mode = modes.get(1);
        } else {
            mode = modes.get(0);
        }

        double avg = (double) sum / (double) t;
        System.out.println(Math.round(avg));
        System.out.println(arr[arr.length/2]);
        System.out.println(mode);
        System.out.println(arr[arr.length-1] - arr[0]);


    }
}
