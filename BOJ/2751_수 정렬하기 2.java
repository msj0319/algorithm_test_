import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testcase = Integer.parseInt(st.nextToken());

        LinkedList<Integer> num = new LinkedList<>();

        for (int i=0; i<testcase; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }
        //Collections.sort()는 Tim Sort이다.
        //Merge sort + Insertion Sort를 합친 Hybrid sorting algorithm
        //Merge : best, worst case 전부 O(nlogn) 보장
        //Insertion : best : O(n), worst : O(n^2) 보장
        //합병, 삽입 정렬 모두 stable sort 이므로 배열 선언을 primitive 가 아닌 List 계열의 자료구조로 선언한다.
        //결론 : Collections.sort()는 Hybrid stable sorting algorithm이다.
        Collections.sort(num);

        //출력 초과가 나기 때문에 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        for (int item : num) {
            sb.append(item).append("\n");
        }
        System.out.println(sb);
    }
}