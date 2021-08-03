import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //테스트 케이스의 수
        int testcase = Integer.parseInt(st.nextToken());
        int[] num = new int[testcase];
        //입력값의 범위 : -4000 ~ 4000 -> 입력되는 절댓값은 4000을 넘지 않는다.
        int[] check = new int[8001];
        int sum = 0;

        //중앙값과 최빈값은 입력값의 범위를 제외한 수로 초기화
        int median = 10000;
        int mode = 10000;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<testcase; i++) {
            num[i] = Integer.parseInt(br.readLine());
            //최빈값 중 두번째로 작은 값을 출력하기 위해 입력값이 몇 번 나왔는지 배열로 카운트
            check[num[i] + 4000]++;
            //산술 평균을 구하기 위한 합
            sum += num[i];
            //최대값 구하기
            if (max < num[i]) {
                max = num[i];
            }
            //최소값 구하기
            if (min > num[i]) {
                min = num[i];
            }
        }
        int count = 0;  //중앙값 빈도 누적 수
        int mode_max = 0;//최대 빈도 값의 최대 값

        //이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아니면 false
        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            //중앙값 찾기
            if (check[i] > 0) {
                //누적횟수가 전체 길이 절반에 못 미친다면
                if (count < (testcase + 1) / 2) {
                    count += check[i];
                    median = i - 4000;
                }
            }
            //최빈값 찾기
            //이전 최빈값보다 현재값의 빈도수가 더 높을 경우
            if (mode_max < check[i]) {
                mode_max = check[i];
                mode = i - 4000;
                flag = true;    //첫 등장이므로 true로 변경
            }
            //이전 최빈값 최대값과 동일한 경우면서 한 번만 중복되는 경우
            else if (mode_max == check[i] && flag == true) {
                mode = i - 4000;
                flag = false;
            }
        }

        //산술 평균, 소수점 이하 첫째 자리에서 반올림
        System.out.println((int) Math.round((double)sum / testcase));
        //중앙 값
        System.out.println(median);
        //최빈값
        System.out.println(mode);
        //범위 값
        System.out.println(max - min);
    }
}