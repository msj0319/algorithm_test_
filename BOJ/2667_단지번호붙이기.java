import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> danji;
    static Queue<Point> queue;
    static int count;

    // 방향을 쉽게 체크
    // 위, 오른, 아래, 왼 순으로 탐색
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
    }

    //2차원 배열을 그래프로 표현해 BFS나 DFS로 순회하는 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   //지도의 크기
        map = new int[N][N];
        visited = new boolean[N][N];

        //지도 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
        //단지 내의 집 수
        count = 0;
        //단지 집의 수 결과 저장
        danji = new ArrayList<>();
        //탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //만약 집이 있는데 (1), 방문 하지 않았다면.
                if (map[i][j] == 1 && !visited[i][j]) {
                    //그래프 탐색 알고리즘, 단지 번호는 1부터 시작함
                    count = 1;
                    //단지 하나의 집의 수를 BFS로 카운팅하여 링크드리스트에 삽입함.
                    danji.add(bfs(i, j));
                }
            }
        }

        //총 단지 수 출력
        System.out.println(danji.size());

        //각 단지 내의 집 수를 오름차순으로 정렬하고 단지 수 만큼 반복하여 출력
        Collections.sort(danji);
        for (int house : danji) {
            System.out.println(house);
        }
    }

    public static int bfs(int x, int y) {
        queue = new LinkedList<Point>();
        queue.offer(new Point(x, y));

        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point node = queue.poll();
            int a = node.x;
            int b = node.y;

            //처음 뽑은 위치에 대해 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                //next는 현재 위치에 상하 좌우 4번 모두 탐색하여 갈 수 있는 집인지 판단.
                int next_x = a + dx[i];
                int next_y = b + dy[i];
                //유효한 범위 내에 갈 수 있는 집(연결된 집의 모임)이고, 한 번이라도 갔던 집이 아니라면
                if (isValidPosition(next_x, next_y) && map[next_x][next_y] == 1 && !visited[next_x][next_y]) {
                    //새로 찾은 집 위치를 큐에 삽입하고 카운팅하여 집의 수를 셈 
                    queue.offer(new Point(next_x, next_y));
                    visited[next_x][next_y] = true;
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isValidPosition(int x, int y) {
        //만약 단지의 범위를 벗어나거나, 다음 갈 곳에 집이 없다면, false
        if (x < 0 || x >= N || y < 0 || y >= N || map[x][y] == 0)
            return false;
        return true;
    }
}