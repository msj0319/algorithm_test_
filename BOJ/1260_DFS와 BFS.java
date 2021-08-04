import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static void dfs(int V, boolean[] visited) {
        if (visited[V]) {   //1. 입력된 노드가 이미 방문한 노드인가?
            return;
        }
        visited[V] = true;  //2. 방문 안했다면 해당 노드에 대해 방문여부 찍어주기
        System.out.print(V);//3. 방문한 노드 출력
        System.out.print(" ");

        //4. 방문된 노드의 연결된 노드에 대해 끝날 때 까지 방문하여 그래프를 탐색
        for (int next_v : graph[V]) {
            dfs(next_v, visited);
        }
    }

    static void bfs(int V, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();  //1. 방문한 노드들을 담기위한 큐 생성
        queue.offer(V);                             //2. 입력받은 노드를 큐에 삽입

        while (!queue.isEmpty()) {
            V = queue.poll();

            if (visited[V]) continue;               //3. 만약 꺼낸 노드가 이미 방문한 노드라면, 넘어감
            visited[V] = true;                      //4. 방문하지 않았다면 true로 마킹
            System.out.print(V);                    //5. 방문한 노드는 출력
            System.out.print(" ");

            for (int next_v : graph[V]) {           //6. 방문된 노드에 연결된 노드들을 전부 큐에 삽입
                queue.offer(next_v);
            }
        }
    }

    public static int N;
    public static LinkedList<Integer>[] graph;     //0. 링크드리스트의 한 노드에 다른 링크드리스트를 연결할 수 있도록 선언한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   //정점의 개수
        int M = Integer.parseInt(st.nextToken());   //간선의 개수
        int V = Integer.parseInt(st.nextToken());   //탐색을 시작할 정점의 번호

        graph = new LinkedList[N+1];                  //1. 정점의 개수만큼 노드 생성

        //2. 생성한 노드 마다 링크드리스트 객체를 할당하여 연결할 수 있도록 한다. (N이 4면 4*4 인접행렬을 만드는 것과 같다.)
        for (int i = 1; i <= N; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int i=0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            //3. 노드가 각각 연결됨을 구현한다.
            graph[node1].add(node2);
            graph[node2].add(node1);

            //4. 간선으로 연결된 정점들을 정렬
            Collections.sort(graph[node1]);
            Collections.sort(graph[node2]);
        }

        //5. 방문 여부를 확인하는 배열
        boolean[] dfs_visited = new boolean[N+1];
        boolean[] bfs_visited = new boolean[N+1];
        
        dfs(V, dfs_visited);
        System.out.println();
        bfs(V, bfs_visited);

    }
}