import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    static int cnt;
    static int K;
    static int answer;
    public static int[] mergeSort(int[] array, int left, int right) {
         // 분할할 부분이 남아있는 경우
        if (left < right) {
            // 배열을 분할할 인덱스 계산
            int mid = (left + right) / 2;

            // 왼쪽 부분 배열 정렬
            mergeSort(array, left, mid);

            // 오른쪽 부분 배열 정렬
            mergeSort(array, mid + 1, right);

            // 정렬된 두 부분 배열 병합
            merge(array, left, mid, right);
        }

        return array;
    }
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1; // 왼쪽 배열 크기
        int n2 = right - mid;    // 오른쪽 배열 크기

        // 임시 배열 생성
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // 데이터 복사
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // 병합 시작
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i++];
                cnt++;
                if(cnt == K) answer = array[k];
                k++;

            } else {
                array[k] = rightArray[j++];
                cnt++;
                if(cnt == K) answer = array[k];
                k++;
            }
        }

        // 남은 요소 처리
        while (i < n1) {
            array[k] = leftArray[i++];
            cnt++;
            if(cnt == K) answer = array[k];
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j++];
            cnt++;
            if(cnt == K) answer = array[k];
            k++;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        answer = -1;

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println(answer);
    }
}
