import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31};

    //서기 year년은 윤년인가? 운년이면 1, 평년이면 0
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) ? 1 : 0;
    }

    static int calculateDays(int year, int month, int day) {
        int sum = 0;
        for (int i = 0; i < year; ++i) {  //1년 부터 9999년까지
            sum += 365 + isLeap(i);       //평년이면 0, 윤년이면 1더하기
        }
        for (int i = 0; i + 1 < month; ++i) {
            if (i == 1)
                sum += isLeap(year);
            sum += mdays[i];
        }
        return sum + day;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dyear = Integer.parseInt(st.nextToken());

        int dmonth = Integer.parseInt(st.nextToken());
        int dday = Integer.parseInt(st.nextToken());

        //만약 캠프가 천년 이상 지속된다면 (오늘이 y년 m월 d일이고, D-Day가 y+1000년 m월 d일과 같거나 늦다면) 대신 "gg"를 출력한다.
        if (dyear - year >= 1000 && calculateDays(0, month, day) <= calculateDays(0, dmonth, dday)) {
            System.out.println("gg");
        }
        else {
            int r1 = calculateDays(year, month, day);
            int r2 = calculateDays(dyear, dmonth, dday);
            System.out.println("D-"+ (r2-r1));
        }
    }
}

