package section8복습;
import java.util.*;


public class 섬나라아일랜드_DFS {
	static int n, answer = 0;
	static int[][] board;
	static int[] dx = {0, 1, 1, 1, 0 , -1, -1, -1};
	static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
	public void DFS(int x, int y, int[][] board) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx , ny, board);
			}
		}
	}
	
	
	public void solution(int[][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					answer ++;
					board[i][j] = 0;
					DFS(i, j, board);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		섬나라아일랜드_DFS T = new 섬나라아일랜드_DFS();
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
