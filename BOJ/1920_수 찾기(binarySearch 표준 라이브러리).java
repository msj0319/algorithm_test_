import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int idx = 0;

        for (int i=0; i<M; i++) {
            //java.util.Arrays의 binarySearch 메서드 사용
            //값을 못 찾으면 음수, 찾으면 해당 인덱스 반환 
            idx = Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()));
            if (idx < 0)
                System.out.println("0");
            else
                System.out.println("1");
        }

    }
}