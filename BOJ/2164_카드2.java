import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<num; i++) {
            queue.offer(i+1);
        }

        while (queue.size() > 1) {
            queue.remove();             //제일 위의 카드를 버리고
            queue.add(queue.poll());    //다음 카드를 제일 아래로 옮기기
        }
        System.out.println(queue.poll());
    }
}