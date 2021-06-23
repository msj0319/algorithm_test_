import java.util.*;
public class Main {

    public static String solution(String s) {
        String answer = "";
        //알파벳씩 끊어 문자열 배열에 넣기
        String[] s2 = s.split("");
        //문자열 배열 내 알파벳을 사전 순으로 정렬
        Arrays.sort(s2,Collections.reverseOrder());

        //StringBuffer 사용 String 배열의 요소를 모두 탐색
        //append() 메소드 사용하여 각 요소를 StringBuffer 객체에 추가
        //toString() 메소드 사용, StringBuffer 객체를 문자열로 만들기
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<s2.length; i++) {
            sb.append(s2[i]);
        }
        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}