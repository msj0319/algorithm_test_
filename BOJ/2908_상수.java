import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();  //734
        String b = st.nextToken();  //893

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        char[] a1 = new char[3];
        char[] b1 = new char[3];

        int r_1 = 0, r_2 = 0;

        for (int i = 0; i < 3; i++) {
            a1[i] = a.charAt(i);
            b1[i] = b.charAt(i);
        }
        for (int j = 2; j >= 0; j--) {
            num1.append(a1[j]);
            num2.append(b1[j]);
        }
        r_1 = Integer.parseInt(String.valueOf(num1));
        r_2 = Integer.parseInt(String.valueOf(num2));

        if (r_1 > r_2)
            System.out.println(r_1);
        else
            System.out.println(r_2);
    }
}

