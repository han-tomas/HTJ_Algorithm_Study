package section8복습;
import java.util.*;


public class 수열추측하기 {
	static int n, f; // n : 윗줄에 있는 숫자 갯수, f : 가장 밑줄에 있는 수
	static int[] p, ch, b; // p : permutation(순열), ch : 순열을 만들기 위한 체크리스트
							// b :  binomial coefficient(조합)
	static int[][] c = new int[15][15]; // 조합 메모이제이션 // 정수 n의 범위가 1 <= n <= 10 이므로 넉넉히 15x15 배열 생성
	boolean flag = false;
	
	
	public int combi (int n, int r) { // 조합 만들기
		if (c[n][r] > 0) return c[n][r];
		if (n == r || r == 0) return 1;
		else return c[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	}
	
	public void DFS(int L, int sum) {
		if (flag) return;
		if (L == n) {
			if (sum == f) {
				for (int x: p) System.out.print(x + " ");
				flag = true;
			}
		}
		else {
			for (int i = 1; i <= n; i++) {
				if(ch[i] == 0) {
					p[L] = i;
					ch[i] = 1;
					DFS(L + 1, sum + (p[L] * b[L]));
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		수열추측하기 T = new 수열추측하기();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		f = scan.nextInt();
		p = new int[n];
		ch = new int[n+1];
		b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = T.combi(n - 1, i);
		}
		T.DFS(0, 0);
	}

}
