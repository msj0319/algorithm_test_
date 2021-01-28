import java.util.*;
import java.io.*;
public class Main {

    public static void dfs(int vertex, boolean[] visited, StringBuilder sb) {
        if (visited[vertex]) {  //이미 방문한 노드라면, 더 이상 방문할 노드가 없으면 종료.
            return;
        }
        visited[vertex] = true; //입력으로 받은 노드 방문표시.
        sb.append(vertex).append(" "); //순회 결과 append
        for (int next_vertex : vertexList[vertex]) {
            dfs(next_vertex, visited, sb);  //다음 노드로 dfs 수행. (Recursive)
        }
    }

    public static void bfs(int vertex, boolean[] visited, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<Integer>();   //방문한 노드의 자식들을 담기위한 큐 생성
        queue.offer(vertex);    //시작 노드부터 push
        while (!queue.isEmpty()) {
            vertex = queue.poll();  //방문한 노드의 자식노드 pop. 방문할 노드 선택
            if (visited[vertex]) continue;  //꺼낸 자식 노드가 이미 방문한 노드면 다음 노드 꺼내기

            visited[vertex] = true;         //선택된 노드는 방문했다고 표시.
            sb.append(vertex).append(" ");  //방문 결과

            for (int next_vertex : vertexList[vertex]) {
                queue.offer(next_vertex);   //그 다음 노드 큐에 삽입
            }
        }
    }
    public static int vertex_cnt; 
    public static LinkedList<Integer>[] vertexList;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine()); 

        //첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
        vertex_cnt = Integer.parseInt(st.nextToken()); //첫째줄의 첫째 값에서 정수값은 정점 갯수
        int edge_cnt = Integer.parseInt(st.nextToken()); //다음 값은 간선 갯수
        int start_vertex = Integer.parseInt(st.nextToken()); //시작 버텍스

        vertexList = new LinkedList[vertex_cnt + 1];
                                    //vertex 번호는 1부터 시작
        //vertex 하나가 연결될 수 있는 만큼의 공간 할당
        for (int i=0; i <= vertex_cnt; i++) {
            vertexList[i] = new LinkedList<Integer>();
        }
        for (int i=0; i < edge_cnt; i++) {
            st = new StringTokenizer(br.readLine());
            //연결된 노드 정보 가져오기
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            //노드끼리 연결
            vertexList[node1].add(node2);
            vertexList[node2].add(node1);

            //한 노드에 연결된 노드 정렬
            Collections.sort(vertexList[node1]);
            Collections.sort(vertexList[node2]);
        }
        //깊이우선, 너비우선탐색 결과 출력. 성능을 위한 StringBuilder 객체 사용.
        StringBuilder dfs_result = new StringBuilder();
        StringBuilder bfs_result = new StringBuilder();

        //vertex가 방문했는지, 방문하지 않았는지 판단하는 visited 배열. 모두 0으로 초기화.
        boolean[] dfs_visited = new boolean[vertex_cnt+1];
        boolean[] bfs_visited = new boolean[vertex_cnt+1];

        dfs(start_vertex, dfs_visited, dfs_result);
        bfs(start_vertex, bfs_visited, bfs_result);

        System.out.println(dfs_result + "\n" + bfs_result);
    }
}
