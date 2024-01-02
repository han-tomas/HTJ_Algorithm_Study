package section8복습;
import java.util.*;


public class 조합의경우수_메모이제이션 {
	static int n,r;
	static int[][] ch = new int[35][35];
	public int DFS(int n, int r) {
		if (ch[n][r] > 0) return ch[n][r];
		if (n == r || r == 0) return 1;
		else {
			return ch[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
		}
	}
	public static void main(String[] args) {
		조합의경우수_메모이제이션 T = new 조합의경우수_메모이제이션();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		r = scan.nextInt();
		System.out.println(T.DFS(n, r));
	}

}
