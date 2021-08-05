import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //포켓몬의 개수
        int M = Integer.parseInt(st.nextToken());   //내가 맞춰야 하는 문제의 개수

        StringBuilder sb = new StringBuilder();
        HashMap<String, String> dogam = new HashMap<>();

        for (int i=0; i<N; i++) {
            String pokemon = br.readLine();
            String index = Integer.toString(i+1);
            //{포켓몬 이름=번호} 또는 {번호=포켓몬 이름}으로 저장하여 검색을 용이하게 함
            dogam.put(index,pokemon);
            dogam.put(pokemon,index);
        }

        for (int i=0; i<M; i++) {
            sb.append(dogam.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}