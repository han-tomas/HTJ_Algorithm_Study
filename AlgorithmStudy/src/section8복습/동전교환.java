package section8복습;
import java.util.*;


public class 동전교환 {
	static int n, m, min = Integer.MAX_VALUE;
	static Integer[] coins;
	public void DFS(int L, int sum, Integer[] coins) {
		if(sum > m) return;
		if(L > min) return; 
		if(sum == m) {
			min = Math.min(L, min);
		}
		else {
			for (int i = 0; i < n; i++) {
				DFS(L + 1, sum + coins[i], coins);
			}
		}
	}
	public static void main(String[] args) {
		동전교환 T = new 동전교환();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		coins = new Integer[n];
		for (int i = 0; i < n; i++) {
			coins[i] = scan.nextInt();
		}
		Arrays.sort(coins, Collections.reverseOrder());
		m = scan.nextInt();
		T.DFS(0, 0, coins);
		System.out.println(min);
	}

}
