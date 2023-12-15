package section5복습;
import java.util.*;


public class 크레인인형뽑기 {
	public int solution(int N, int[][] arr, int M, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int m: moves) {
			for (int i = 0; i < N; i++) {
				if (arr[i][m-1] != 0) {
					if(!stack.isEmpty() && stack.peek() == arr[i][m-1]) {
						stack.pop();
						answer = answer + 2;
					}
					else stack.push(arr[i][m-1]);
					arr[i][m-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		크레인인형뽑기 T = new 크레인인형뽑기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int M = scan.nextInt();
		int[] moves = new int[M];
		for (int i = 0; i < M; i++) {
			moves[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, arr, M, moves));
	}

}
