package section8_DFS_BFS_활용;
import java.util.*;


public class 동전교환 {
	static int n, change, min = Integer.MAX_VALUE;
	public void DFS(int L, int sum, Integer[] coins) {
		
		if (sum > change) return;
		if (L >= min) return;
		if (sum == change) {
			min = Math.min(min, L);
		}
		else {
			for (int i = 0; i < n; i++) {
				DFS(L+1, sum+coins[i], coins);
			}
		}
	}
	public static void main(String[] args) {
		동전교환 T = new 동전교환();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		Integer[] coins = new Integer[n];
		for (int i = 0; i < n; i++) coins[i] = scan.nextInt();
		Arrays.sort(coins, Collections.reverseOrder());
		change = scan.nextInt();
		T.DFS(0, 0, coins);
		System.out.println(min);
	}

}
