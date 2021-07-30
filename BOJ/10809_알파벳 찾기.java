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

        ArrayList<Character> str = new ArrayList<>();
        String str1 = st.nextToken();
        int[] result = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i=0; i<str1.length(); i++) {
            str.add(str1.charAt(i));
        }

        for (int i=0; i<str.size(); i++) {
            for (int j=0; j<alphabet.length; j++) {
                if (str.get(i) == alphabet[j])
                    if (result[j] == -1)
                        result[j] = i;
            }
        }
        for (int i=0; i< result.length; i++)
            System.out.print(result[i] + " ");
    }
}

