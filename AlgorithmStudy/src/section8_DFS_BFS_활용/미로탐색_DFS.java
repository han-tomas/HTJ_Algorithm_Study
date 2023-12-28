package section8_DFS_BFS_활용;
import java.util.*;


public class 미로탐색_DFS {
	static int[][] miro;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int answer = 0;
	public void DFS(int x, int y) {
		if(x == 7 && y == 7) answer ++;
		else {
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && miro[nx][ny] == 0) {
					miro[nx][ny] = 1;
					DFS(nx, ny);
					miro[nx][ny] = 0;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		미로탐색_DFS T = new 미로탐색_DFS();
		Scanner scan = new Scanner(System.in);
		miro = new int[8][8];
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				miro[i][j] = scan.nextInt();
			}
		}
		miro[1][1] = 1;
		T.DFS(1, 1);
		System.out.println(answer);
	}

}
