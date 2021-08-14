import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testcase = Integer.parseInt(st.nextToken());

        Integer[] num = new Integer[testcase];

        for (int i=0; i<testcase; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (int item : num) {
            sb.append(item).append("\n");
        }
        System.out.println(sb);
    }
}