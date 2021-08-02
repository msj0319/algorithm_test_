import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testcase = Integer.parseInt(st.nextToken());
        Integer[][] coordinate = new Integer[testcase][2];

        for (int i=0; i<testcase; i++) {
            st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }

        //Comparator 클래스 사용
        Arrays.sort(coordinate, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0].equals(o2[0])) {  //첫번째 배열의 x좌표와 두번째 배열의 x좌표가 같으면
                    return o1[1] - o2[1];  //첫번째, 두번째 배열의 y좌표를 기준으로 정렬
                } else {
                    return o1[0] - o2[0];  //아니라면 x좌표 기준으로 정렬
                }
            }
        });

//        람다식 구현 법
//        Arrays.sort(coordinate, (o1, o2) -> {
//            if (o1[0].equals(o2[0])) {  
//                return o1[1] - o2[1];  
//            } else {
//                return o1[0] - o2[0];  
//            }
//        });

        for (int i=0; i<testcase; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(coordinate[i][j] + " ");
            }
            System.out.println();
        }
    }
}