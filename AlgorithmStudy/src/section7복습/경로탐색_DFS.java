package section7복습;
import java.util.*;


public class 경로탐색_DFS {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		if (v == n) answer ++;
		else {
			for (int i = 1; i <= n; i++) {
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		경로탐색_DFS T = new 경로탐색_DFS();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph[a][b] = scan.nextInt();
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		
	}

}
