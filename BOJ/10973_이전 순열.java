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

    public static void previous_permutation(int[] arr) {
        int n = arr.length;
        boolean b = false;
        //input -> 1 2 5 3 4
        Loop1: for (int i = n-1; i >= 1; i--) {   //1. 마지막 인덱스부터 처음 인덱스까지 순회
            int source = -1;
            //index 2 = 5 > index 3 = 3
            if (arr[i-1] > arr[i]) {    //2. 좌측 인덱스와 우측 인덱스를 비교하여 좌측 인덱스 값이 더 크다면 아래 반복문 수행
                b = true;
                source = i-1;           //2-1. 좌측 인덱스를 source라고 명함. (index 2 = source)
                int next_source = -1;

                for (int j = n-1; j >= i; j--) {    //3. 배열의 마지막 인덱스(n-1) 부터 좌측보다 작았던 우측 인덱스(target = 3)까지 순회함.
                    if (arr[source] > arr[j]) {     //4. 만약 j 값(n-1 => 4)보다 좌측 인덱스(source) 값(== 5)이 더 크면
                        next_source = source + 1;   //스왑될 source 위치 이후 인덱스이다.

                        swap(arr, source, j);       //5. 두 원소 스왑 => 1 2 '4' 3 '5'
                        int last = n-1;             //k = 4

                        while (next_source < last) {//6. 마지막으로 스왑된 인덱스 이후(source+1 = i번째)부터 배열의 끝(n-1 = k)까지
                            swap(arr, next_source, last);     //스왑하여 모두 reverse 시킨다.
                            next_source++;
                            last--;                 //1 2 4 "3 5" -> 1 2 4 "5 3"
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
        previous_permutation(arr);
    }
}