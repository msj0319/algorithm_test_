import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //HashSet은 중복을 포함하지 않고 값을 삽입한다는 특징이 있다.
        HashSet<Integer> num = new HashSet<>();

        for (int i=0; i<10; i++) {
            num.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(num.size());
    }
}