package section2복습;
import java.util.*;
public class 멘토링retry {
	public int solution(int N, int M, int[][] arr) {
		int answer = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int count = 0;
				for (int k = 0; k < M; k++) {
					int irank = 0;
					int jrank = 0;
					for (int s = 0; s < N; s++) {
						if(arr[k][s] == i) irank = s;
						if(arr[k][s] == j) jrank = s;
					}
					if (irank < jrank) count ++;
				}
				if (count == M) answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		멘토링retry T = new 멘토링retry();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] arr = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(N, M, arr));
	}

}
