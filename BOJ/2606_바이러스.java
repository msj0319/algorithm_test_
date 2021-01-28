import java.util.*;
import java.io.*;
public class Main {

    public static int bfs(int host, boolean[] infected, int virus_computer) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(host);
        while (!queue.isEmpty()) {
            host = queue.poll();
            if (infected[host]) continue;

            infected[host] = true;
            virus_computer++;

            for (int next_vertex : computerList[host]) {
                queue.offer(next_vertex);
            }
        }
        return virus_computer;
    }
    public static int computer_cnt;
    public static LinkedList<Integer>[] computerList;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        computer_cnt = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int edge_cnt = Integer.parseInt(st.nextToken());

        computerList = new LinkedList[computer_cnt + 1];

        for (int i=0; i <= computer_cnt; i++) {
            computerList[i] = new LinkedList<Integer>();
        }
        for (int i=0; i < edge_cnt; i++) {
            st = new StringTokenizer(br.readLine());

            int connected_computer1 = Integer.parseInt(st.nextToken());
            int connected_computer2 = Integer.parseInt(st.nextToken());

            computerList[connected_computer1].add(connected_computer2);
            computerList[connected_computer2].add(connected_computer1);

            Collections.sort(computerList[connected_computer1]);
            Collections.sort(computerList[connected_computer2]);
        }
        int virus_computer = 0;
        boolean[] infected = new boolean[computer_cnt+1];
        virus_computer = bfs(1, infected, virus_computer);

        System.out.println(virus_computer-1);
    }
}
