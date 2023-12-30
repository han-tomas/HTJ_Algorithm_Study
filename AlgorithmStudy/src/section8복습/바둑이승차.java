package section8복습;
import java.util.*;


public class 바둑이승차 {
	static int n, c, max = Integer.MIN_VALUE;
	static int[] dog;
	public void DFS(int L, int sum, int[] dog) {
		if (sum > c) return;
		if (L == n) {
			max = Math.max(max, sum);
		}
		else {
			DFS(L + 1, sum + dog[L], dog);
			DFS(L + 1, sum, dog);
		}
	}
	
	
	public static void main(String[] args) {
		바둑이승차 T = new 바둑이승차();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		dog = new int[n];
		for (int i = 0; i < n; i++) {
			dog[i] = scan.nextInt();
		}
		T.DFS(0, 0, dog);
		System.out.println(max);
	}

}
