package section8_DFS_BFS_활용;
import java.util.*;


public class 조합구하기 {
	static int n, m;
	static int[] combi;
	public void DFS(int L, int s) {
		if(L == m) {
			for(int x: combi) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i = s; i <= n; i++) {
				combi[L] = i;
				DFS(L+1, i+1);			
			}
		}
	}
	
	
	public static void main(String[] args) {
		조합구하기 T = new 조합구하기();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}

}
