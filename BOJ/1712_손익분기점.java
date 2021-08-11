import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());   //1000
        int B = Integer.parseInt(st.nextToken());   //70
        int C = Integer.parseInt(st.nextToken());   //170

        //총 수입과 총 비용이 같아질 때 (생산 개수 n)
            //=> n * C = A + n * B
            //=> (n * C) - (n * B) = A
            //=> n(C - B) = A
            //=> n = A / (C - B)

        if (C - B <= 0) //(C - B)가 음수거나 0이면 손익분기점이 없다는 뜻.
            System.out.println("-1");
        else
            //총 이익이 나는 지점 => n = A / (C - B) + 1
            System.out.println((A/(C-B))+1);
        
    }
}