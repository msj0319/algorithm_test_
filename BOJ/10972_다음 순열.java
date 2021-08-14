import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void next_permutation(int[] arr) {
        int n = arr.length;
        boolean b = false;

        Loop1: for (int i = n-1; i >= 1; i--) {
            int source = -1;

            if (arr[i-1] < arr[i]) {    //부등호 변경
                b = true;
                source = i-1;
                int next_source = -1;

                for (int j = n-1; j >= i; j--) {
                    if (arr[source] < arr[j]) {     //부등호 변경
                        next_source = source + 1;

                        swap(arr, source, j);
                        int last = n-1;

                        while (next_source < last) {
                            swap(arr, next_source, last);
                            next_source++;
                            last--;
                        }
                        break Loop1;
                    }
                }
            }
        }
        //만약 b 값이 true 면 순열의 첫번째이므로(다음 반복문을 거치지 않았으므로) -1 출력
        if (b) {
            for (int i=0; i< arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        next_permutation(arr);
    }
}