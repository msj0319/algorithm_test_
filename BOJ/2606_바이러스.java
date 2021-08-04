import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int bfs(int V, boolean[] visited, int infected) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);

        while (!queue.isEmpty()) {
            V = queue.poll();

            if (visited[V]) continue;
            visited[V] = true;

            infected++;

            for (int next_v : computer_list[V]) {
                queue.offer(next_v);
            }
        }
        return infected;
    }

    public static int computer_num;
    public static LinkedList<Integer>[] computer_list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computer_num = Integer.parseInt(br.readLine());
        int connected_num = Integer.parseInt(br.readLine());

        computer_list = new LinkedList[computer_num + 1];

        for (int i=1; i<=computer_num; i++) {
            computer_list[i] = new LinkedList<>();
        }

        for (int i=0; i<connected_num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int comp1 = Integer.parseInt(st.nextToken());
            int comp2 = Integer.parseInt(st.nextToken());

            computer_list[comp1].add(comp2);
            computer_list[comp2].add(comp1);

            Collections.sort(computer_list[comp1]);
            Collections.sort(computer_list[comp2]);
        }

        int infected = -1;
        boolean[] bfs_visited = new boolean[computer_num+1];

        infected = bfs(1, bfs_visited, infected);
        System.out.println(infected);
    }
}