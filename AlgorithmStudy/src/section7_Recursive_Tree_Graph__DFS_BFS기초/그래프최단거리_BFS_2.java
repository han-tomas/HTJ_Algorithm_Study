package section7_Recursive_Tree_Graph__DFS_BFS기초;
import java.util.*;
public class 그래프최단거리_BFS_2 {
	static int n, m = 0;
	static int[][] graph;
	static int[] ch, dis;
	
	
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<Integer>();
		ch[1] = 1;
		dis[1] = 0;
		Q.offer(v);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 1; j <= n; j++) {
					if(graph[x][j] == 1) {
						if (ch[j] == 0) {
							ch[j] = 1;
							dis[j] = L+1;
							Q.offer(j);
						}
					}
				}
			}
			L++;
		}
	}
	
	
	public static void main(String[] args) {
		그래프최단거리_BFS_2 T = new 그래프최단거리_BFS_2();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ch = new int[n+1];
		dis = new int[n+1];
		graph = new int[n+1][n+1];
		for (int i = 1; i <= m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph[a][b] = 1;
		}
		T.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}
