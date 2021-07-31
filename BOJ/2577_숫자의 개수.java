import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] number = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int mul = 0;
        ArrayList<Integer> num = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        mul = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        mul *= Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        mul *= Integer.parseInt(st.nextToken());


        while (mul != 0) {
            num.add(mul % 10);
            mul /= 10;
        }

        for (int i=0; i<num.size(); i++) {
            number[num.get(i)] ++;
        }
        for (int j=0; j< number.length; j++)
            System.out.println(number[j]);
    }
}

