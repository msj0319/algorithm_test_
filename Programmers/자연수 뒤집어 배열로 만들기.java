import java.util.*;
public class Main {

    public static int[] solution(long n) {
        String str = ""+n;  //long 타입을 String으로 변환
        int num = str.length(); //그걸 통해 n의 길이를 알 수 있음
        int[] answer = new int[num];  //알아낸 길이를 통해 answer 배열 크기 선언

        for (int i=0; i<num; i++) { //문자열을 한 자리씩 끊어 문자열 뒤부터 배열에 넣기
            answer[i] = (int) (n%10);
            n/=10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}