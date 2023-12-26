package section8_DFS_BFS_활용;
import java.util.*;


public class 바둑이승차 {
	static int c, n;
	static int max = Integer.MIN_VALUE;
	public void DFS(int L, int sum, int[] arr) {
		if(sum > c) return;
		if(L == n) {
			max = Math.max(max, sum);
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args) {
		바둑이승차 T = new 바둑이승차();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(max);
	}

}
