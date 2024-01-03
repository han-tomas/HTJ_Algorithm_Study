package section8복습;
import java.util.*;


class Point{
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class 미로최단거리통로 {
	static int[][] board, dis;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		while(!Q.isEmpty()) {
			Point temp = Q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					dis[nx][ny] = dis[temp.x][temp.y] + 1;
					Q.offer(new Point(nx, ny));
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		미로최단거리통로 T = new 미로최단거리통로();
		Scanner scan = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		board[1][1] = 1;
		T.BFS(1, 1);
		if (dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
	}

}
