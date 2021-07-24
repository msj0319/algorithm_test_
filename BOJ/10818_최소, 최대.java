import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int max(int[] a) {
        int max = a[0];
        for (int i=0; i<a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
    static int min(int[] a) {
        int min = a[0];
        for (int i=0; i<a.length; i++)
            if (a[i] < min)
                min = a[i];
        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(min(arr) + " " + max(arr));
    }
}

