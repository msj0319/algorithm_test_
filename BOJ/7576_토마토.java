import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int M;
    static int N;
    static int[][] map;;

    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    static class Point {
        int x;
        int y;

        Point (int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
    }
    static Queue<Point> queue;

    public static void bfs() {
        queue = new LinkedList<>();

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                //만약 맵 중에 익은 토마토가 존재 하면 그 위치를 큐에 삽입
                if (map[i][j] == 1)
                    queue.offer(new Point(i,j));
            }
        }

        while (!queue.isEmpty()) {
            Point node = queue.poll();
            int a = node.x;
            int b = node.y;

            for (int i=0; i<4; i++) {
                int node2_x = a + dx[i];
                int node2_y = b + dy[i];
                //토마토 상자 범위가 아니면 넘어감
                if (!isValidPosition(node2_x, node2_y)) continue;
                //다음 탐색할 위치가 안익은 토마토거나, 익은 토마토라면 넘어감
                if (map[node2_x][node2_y] != 0) {
                    continue;
                }
                else {
                    //익은 토마토에 의해 하루 뒤에 인접한 안익은 토마토는 익은 토마토가 된다.
                    map[node2_x][node2_y]  = map[a][b] + 1;
                    //익은 토마토이므로 그 위치를 토마토에 삽입
                    queue.offer(new Point(node2_x, node2_y));
                }
            }
        }
        int max = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                //토마토가 모두 익지는 못하는 상황이면 -1을 출력해야 한다.
                if (map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, map[i][j]);
            }
        }
        //토마토가 모두 익을 때까지의 최소 날짜를 출력 (BFS 탐색 시 최소 경로)
        System.out.println(max - 1);
    }
    public static boolean isValidPosition(int x, int y) {
        //주변에 안익은 토마토가 있거나, 상자의 범위를 벗어나면 false
        if (x < 0 || x >= N || y < 0 || y >= M)
            return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());   //토마토 상자의 가로 길이
        N = Integer.parseInt(st.nextToken());   //토마토 상자의 세로 길이

        map = new int[N][M];

        //토마토 상태 입력받기
        for (int i=0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();
    }
}