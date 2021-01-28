import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int elem = -1;

        while (count-- > 0) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();

            switch (method) {
                case "push_front":
                    elem = Integer.parseInt(st.nextToken());
                    queue.offerFirst(elem);
                    break;
                case "push_back":
                    elem = Integer.parseInt(st.nextToken());
                    queue.offerLast(elem);
                    break;
                case "pop_front":
                    if (queue.isEmpty()) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(queue.pollFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if (queue.isEmpty()) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(queue.pollLast()).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1 \n");
                    } else {
                        sb.append(queue.peekLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.size() == 0) {
                        sb.append("1 \n");
                    } else {
                        sb.append("0 \n");
                    }
                    break;
            }

        }
        System.out.println(sb.toString());
    }
}
