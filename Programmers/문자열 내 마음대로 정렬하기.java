import java.util.*;
public class Main {
    public static String[] solution(String[] strings, int n) {
        //Comparator : 기본 정렬 기준과는 다르게 정렬하고 싶은 경우 사용하는 클래스
        //strings 함수를 Comparator 클래스로 새로 정렬하고자 함.
        Arrays.sort(strings, new Comparator<String>() { 
            @Override
            //문자열의 사전순 값을 비교. 그에 해당하는 int 리턴값 반환
            //정렬이 진행될 때 자리바꿈 여부를 알려주는 compare 메소드. 리턴값이 0이나 음수면 자리 바꾸지 않고, 양수인경우 사전 순 자리 바꿈 수행
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                }
                //두개의 문자열이 동일한 경우 
                // -> compare에 의한 리턴값은 0이므로 자리바꿈을 수행하지 않음. 이 땐 사전 순 정렬을 해야함. compareTo 메소드로 리턴값 얻어내기
                // -> o1이 o2보다 사전적으로 순서가 앞서면 양수, o2가 앞서면 음수 반환
                else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                else {
                    return -1;
                }
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun","bed","car"};
        System.out.println((Arrays.toString(solution(strings, 1))));
    }
}