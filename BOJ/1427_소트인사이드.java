import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        LinkedList<Integer> a = new LinkedList<>();

        while (num != 0){
            a.add(num % 10);
            num /= 10;
        }
        Integer[] r_sort = new Integer[a.size()];

        for (int i=0; i<a.size(); i++) {
            r_sort[i] = a.get(i);
        }
        Arrays.sort(r_sort, Collections.reverseOrder());

        for (int i=0; i< r_sort.length; i++) {
            System.out.print(r_sort[i]);
        }
    }
}

