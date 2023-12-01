package section3_TwoPointers_SlidingWindow;
import java.util.*;
public class 연속된자연수의합 {
	public int solution(int N){
		int answer = 0;
		int lt = 1;
		int sum = 0;
		for(int rt = 1 ; rt<N ; rt++) {
			sum+=rt;
			if(sum==N) answer ++;
			while(sum>=N) {
				sum-=lt;
				lt++;
				if(sum==N) answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		연속된자연수의합 T = new 연속된자연수의합();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(T.solution(N));
	}

}
