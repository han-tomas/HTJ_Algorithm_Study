package section8복습;
import java.util.*;


public class 합이같은부분집합 {
	static int n, total = 0;
	static int[] arr;
	static String answer = "NO";
	boolean flag = false;
	public void DFS(int L, int sum, int[] arr) {
		if(flag) return;
		if (sum > total/2) return;
		if (L == n) {
			if (sum == total/2) {
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}
	
	
	public static void main(String[] args) {
		합이같은부분집합 T = new 합이같은부분집합();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}

}
