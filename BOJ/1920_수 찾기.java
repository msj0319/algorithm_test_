import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int binary_search(int[] arr, int N, int key) {
        int start = 0;
        int end = N -1;

        do {
            int mid = (start + end)/2;
            
            if (arr[mid] == key)
                return 1;               //값을 찾으면 1을 리턴
            
            else if (arr[mid] < key)    //만약 찾는 값이 중간값보다 크면
                start = mid + 1;        //배열 시작을 배열 절반 이후로 함
            
            else
                end = mid - 1;          //만약 찾는 값이 중간값보다 작으면 배열 끝을 배열 절반 이전으로 함
        } while (start <= end);

        return 0;                       //검색에 실패하면 0을 리턴
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //이분 탐색은 배열이 정렬되어있어야 함
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            System.out.println(binary_search(arr, N, Integer.parseInt(st.nextToken())));
        }
    }
}