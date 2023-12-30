package section8복습;
import java.util.*;


public class 최대점수구하기 {
	static int n, m, max = Integer.MIN_VALUE;
	static int[] score,time;
	public void DFS(int L, int sum, int limit, int[] score, int[] time) {
		if (limit > m) return;
		if (L == n) {
			max = Math.max(max, sum);
		}
		else {
			DFS(L+1, sum + score[L], limit + time[L], score, time);
			DFS(L+1, sum, limit, score, time);
		}
	}
	
	
	public static void main(String[] args) {
		최대점수구하기 T = new 최대점수구하기();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		score = new int[n];
		time = new int[n];
		for (int i  = 0; i < n; i++) {
			score[i] = scan.nextInt();
			time[i] = scan.nextInt();
		}
		T.DFS(0, 0, 0, score, time);
		System.out.println(max);
	}

}
