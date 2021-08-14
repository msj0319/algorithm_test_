import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void permutation(int[] arr, int depth, int n, int k) {
        if (depth == k)
            print(arr, k);

        for (int i=depth; i<n; i++) {
            rightRotate(arr, depth, i);
            permutation(arr, depth+1, n, k);
            leftRotate(arr, depth, i);
        }
    }
    public static void rightRotate(int[] arr, int start, int end) {
        int last = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i-1];
        }
        arr[start] = last;
    }
    public static void leftRotate(int[] arr, int start, int end) {
        int first = arr[start];
        for (int i = start; i < end; i++) {
            arr[i] = arr[i + 1];
        }
        arr[end] = first;
    }

    public static void print(int[] arr, int k) {
        for (int i=0; i<k; i++) {
            if (i==k-1)
                System.out.println(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //자연수 N
        int M = Integer.parseInt(st.nextToken());   //길이 M

        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        permutation(arr,0, N, M);
    }
}