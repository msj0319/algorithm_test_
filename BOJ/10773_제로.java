import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] stack = new int[num];

        int top = -1;   //top 초기화
        int sum = 0;

        for (int i=0; i<num; i++) {
            int input = Integer.parseInt(br.readLine());

            //stack에 주어진 정수 push
            stack[++top] = input;

            //만약 들어온 값이 0이면
            if (stack[top] == 0) {
                //가장 최근에 쓴 수를 지우고
                stack[--top] = 0;
                //top을 감소시켜 pop 연산을 수행한다.
                top--;
            }
        }

        for (int i=0; i<stack.length; i++) {
            sum += stack[i];
        }
        System.out.println(sum);
    }
}