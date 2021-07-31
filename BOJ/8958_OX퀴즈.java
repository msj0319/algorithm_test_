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

        int testcase = Integer.parseInt(st.nextToken());
        String[] arr = new String[testcase];
        
        for (int i=0; i<testcase; i++) {
            arr[i] = br.readLine();
        }

        for (int i=0; i<testcase; i++) {
            int cnt = 0;        //0이 연속되는 횟수
            int sum = 0;        //누적 합산

            for (int j=0; j< arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {      //문자가 O면 cnt 증가
                    cnt++;
                } else {                            //문자가 X면 cnt를 초기화
                    cnt = 0;
                }
                sum += cnt;                         //증가된 값을 sum에 대입
            }
            System.out.println(sum);
        }

    }
}

