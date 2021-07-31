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

        int[] arr = new int[26];    //영문자의 개수는 26개, 문자의 빈도수를 나타내기 위한 배열 선언
        String str = st.nextToken();    //문자열 입력 받기

        for (int i=0; i<str.length(); i++) {
            //대문자의 범위 : 65 ~ 90
            //소문자의 범위 : 97 ~ 122
            //if input C -> 67, C는 2번째 인덱스. 67-65 = 2이므로 대문자일 땐 A, 소문자일땐 a를 빼서 인덱스 값을 얻어낼 수 있음
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) {   //UpperCase 라면,
                arr[str.charAt(i) - 65]++;  //해당 인덱스 값 1증가 : 문자 등장 빈도수 체크
            }
            else {
                arr[str.charAt(i) - 97]++;
            }
        }
        //배열의 원소 값을 모두 비교하여 가장 큰 값을 갖고 있는 인덱스의 문자를 찾아낸다.
        int max = -1;  //배열 원소값이 max보다 크면 그 배열 원소값으로 max를 치환
        char ch = '?';

        for (int i = 0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = (char) (i + 65);   //대문자를 출력해야 하므로 인덱스값에 65를 더해 대문자로 만든다.
            }
            else if (arr[i] == max) {   //해당 문자의 출현 빈도수와 다른 문자의 출현 빈도수가 같은 경우 //Mississipi -> i = 4, s = 4
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}

