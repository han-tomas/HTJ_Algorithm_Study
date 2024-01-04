package section8복습;
import java.util.*;


public class 피자배달거리 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static List<Point> home;
	static List<Point> pizza;
	static int[] combi;
	static int[][] board;
	public void DFS(int L, int s) {
		if(L == m) {
			int sum = 0;
			for (Point h: home) {
				int dis = Integer.MAX_VALUE;
				for (int i: combi) {
					dis = Math.min(dis, Math.abs(h.x-pizza.get(i).x)+Math.abs(h.y - pizza.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum); 
		}
		else {
			for (int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		피자배달거리 T = new 피자배달거리();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		home = new ArrayList<>();
		pizza = new ArrayList<>();
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int temp = scan.nextInt();
				if (temp == 1) home.add(new Point(i, j));
				else if(temp == 2) pizza.add(new Point(i, j));
			}
		}
		len = pizza.size();
		combi = new int[m];
		T.DFS(0,0);
		System.out.println(answer);
	}

}
