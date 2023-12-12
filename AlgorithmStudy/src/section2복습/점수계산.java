package section2복습;
import java.util.*;
public class 점수계산 {
	public int solution(int N, int[] arr) {
		int answer = 0;
		int score = 1;
		for(int i = 0 ; i<N ; i++) {
			if(arr[i]==1) {
				answer+=score;
				score++;
			}
			else score = 1;
		}
		return answer;
	}
	public static void main(String[] args) {
		점수계산 T = new 점수계산();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i<N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, arr));
	}

}
