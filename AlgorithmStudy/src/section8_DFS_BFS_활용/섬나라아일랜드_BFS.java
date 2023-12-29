package section8_DFS_BFS_활용;
import java.util.*;


class Point{
	public int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class 섬나라아일랜드_BFS {
	static int n,answer = 0;
	static int[][] board;
	static int[] dx = {0, 1, 1, 1, 0 , -1, -1, -1};
	static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
	Queue<Point> Q = new LinkedList<Point>();
	public void BFS() {
		while(!Q.isEmpty()) {
			Point temp = Q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					Q.offer(new Point(nx, ny));
				}
			}
		}
	}
	public void solution(int[][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					answer ++;
					board[i][j] = 0;
					Q.offer(new Point(i, j));
					BFS();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		섬나라아일랜드_BFS T = new 섬나라아일랜드_BFS();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		T.solution(board);
		System.out.println(answer);
	}

}
