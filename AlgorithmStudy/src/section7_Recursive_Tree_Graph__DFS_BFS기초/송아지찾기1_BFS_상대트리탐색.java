package section7_Recursive_Tree_Graph__DFS_BFS기초;
import java.util.*;


public class 송아지찾기1_BFS_상대트리탐색 {
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int S, int E) {
		ch = new int[10001];
		ch[S] = 1;
		Q.offer(S);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 0; j<3; j++) {
					int nx = x + dis[j];
					if (nx == E) return L+1;
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		송아지찾기1_BFS_상대트리탐색 T = new 송아지찾기1_BFS_상대트리탐색();
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int E = scan.nextInt();
		System.out.println(T.BFS(S, E));
	}

}
