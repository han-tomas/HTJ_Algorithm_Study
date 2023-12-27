package section8_DFS_BFS_활용;
import java.util.*;


public class 조합의경우수_메모이제이션 {
	static int n,r;
	int[][] dy = new int[35][35];
	public int DFS(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(n == r || r == 0) return 1;
		else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
	}
	
	
	public static void main(String[] args) {
		조합의경우수_메모이제이션 T = new 조합의경우수_메모이제이션();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		r = scan.nextInt();
		System.out.println(T.DFS(n, r));
	}

}
