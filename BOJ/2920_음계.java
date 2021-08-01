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

        int[] scale = new int[8];
        int ascending = 0;
        int descending = 0;

        for (int i=0; i<scale.length; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<4; i++) {   //음계의 절반만 반복
            if (scale[i] == i + 1 && scale[i] + scale[7 - i] == 9)  //만약 첫번째 값이 1이고, 1 + 8, 2 + 7 ... 반복 더해 9가 나오면 증가하는 것
                ascending ++;
            else if (scale[7 - i] == i + 1 && scale[i] + scale[7 - i] == 9) //만약 마지막 값이 1이고 8 + 1, 7 + 2 .. 반복 더해 9가 나오면 감소하는 것
                descending++;
        }
        if (ascending == 4)
            System.out.println("ascending");
        else if (descending == 4)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}

