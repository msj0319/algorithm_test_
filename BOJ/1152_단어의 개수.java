import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //입력된 문자열을 공백 기준으로 토크나이징
        System.out.println(st.countTokens());                         //그렇게 분리된 토큰들의 갯수
    }
}
