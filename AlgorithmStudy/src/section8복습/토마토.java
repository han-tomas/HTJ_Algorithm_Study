package section8복습;
import java.util.*;


public class 토마토 {
	static int m, n;
	static int[][] board, day;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static Queue<Point> Q = new LinkedList<>();
	public void BFS() {
		while(!Q.isEmpty()) {
			Point temp = Q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					day[nx][ny] = day[temp.x][temp.y] + 1;
					Q.offer(new Point(nx, ny));
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		토마토 T = new 토마토();
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		board = new int[n][m];
		day = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = scan.nextInt();
				if (board[i][j] == 1) Q.offer(new Point(i, j));
			}
		}
		T.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(board[i][j] == 0) flag = false; 
			}
		}
		if (flag) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					answer = Math.max(answer, day[i][j]);
				}
			}
		}
		else answer = -1;
		System.out.println(answer);
		
	}

}
