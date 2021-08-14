import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> card = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int key = Integer.parseInt(st.nextToken());
            //key : 값을 가져와야 하는 요소의 키.
            //defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값.
            //반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환.
            //HashMap의 경우 동일 키 값을 추가할 경우 Value의 값이 "덮어쓰기"가 된다. -> 키의 빈도수 계산이 가능
            card.put(key, card.getOrDefault(key, 0) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(card.getOrDefault(key, 0)).append(' ');
        }
        System.out.println(sb);
    }
}