import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testcase = Integer.parseInt(st.nextToken());
        
        String str = "";
        int num = 0;
        char[] result;

        for (int i=0; i<testcase; i++) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            ArrayList<Character> ch = new ArrayList<>();

            for (int j=0; j<str.length(); j++){
                for (int k=0; k<num; k++) {
                    ch.add(str.charAt(j));
                }
            }
            result = new char[ch.size()];
            for (int l=0; l<result.length; l++) {
                result[l] = ch.get(l);
                System.out.print(result[l]);
            }
            System.out.println();
        }
    }
}

