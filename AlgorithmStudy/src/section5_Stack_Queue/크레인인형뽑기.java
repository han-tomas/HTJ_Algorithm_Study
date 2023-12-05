package section5_Stack_Queue;
import java.util.*;
public class 크레인인형뽑기 {
	public int solution(int N , int[][] arr, int M, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i<M ; i++) {
			for(int j = 0 ; j<N ; j++) {
				if(arr[j][moves[i]-1]!=0) {
					int temp = arr[j][moves[i]-1];
					arr[j][moves[i]-1]=0;
					if(!stack.isEmpty() && temp == stack.peek()) {
						answer +=2;
						stack.pop();
					}
					else {
						stack.push(temp);
					}
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
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int M = scan.nextInt();
		int[] moves = new int[M];
		for(int i = 0 ; i<M ; i++) {
			moves[i]=scan.nextInt();
		}
		System.out.println(T.solution(N, arr, M, moves));
	}

}
