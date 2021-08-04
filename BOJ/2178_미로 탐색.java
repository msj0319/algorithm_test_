import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
    static int N;
    static int M;
    static int arr[][];
    static boolean[][] visited;

    // 방향을 쉽게 체크
    // 위, 오른, 아래, 왼 순으로 탐색
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    static class Point {
        int x;
        int y;
        int distance;

        Point (int x, int y, int distance) {
            super();
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    static Queue<Point> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //지나야 하는 최소의 칸 수 (열 4, 행 6)
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        //미로를 입력받을 2차원 행렬
        arr = new int[N][M];
        
        //주어진 미로를 한 줄씩 읽음
        for (int i = 0; i < N; i++) {
            String line = br.readLine();    
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        //방문 여부를 체크할 배열
        visited = new boolean[N][M];
        visited[0][0] = true;

        System.out.println(bfs(0,0));

    }
    public static int bfs(int x, int y) {
        queue = new LinkedList<Point>();
        queue.offer(new Point(x, y, 1));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point node = queue.poll();
            int a = node.x;
            int b = node.y;
            int dist = node.distance;
            
            //미로를 모두 탐색했으면 몇번 탐색했는지 반환
            if (a == N - 1 && b == M - 1) {
                return dist;
            }
            //처음 뽑은 노드에 대해 상하좌우 탐색
            for (int i=0; i<4; i++) {    
                //next는 현재 위치에 상하 좌우 4번 모두 탐색하여 갈 수 있는 길인지 판단.
                int next_x = a + dx[i];
                int next_y = b + dy[i];
                //갈 수 있는 길이고, 한 번이라도 갔던 길이 아니라면 큐에 삽입하고 카운팅.
                if (isValidPosition(next_x, next_y) && !visited[next_x][next_y]) {
                    queue.offer(new Point(next_x, next_y, dist + 1));
                    visited[next_x][next_y] = true;
                }
            }
        }
        return 0;
    }
    public static boolean isValidPosition(int x, int y) {
        //만약 미로의 범위를 벗어나거나, 가려는 길이 갈 수 없는 길이라면, false
        if (x < 0 || x >= N || y < 0 || y >= M || arr[x][y] == 0)
            return false;
        return true;
    }
}