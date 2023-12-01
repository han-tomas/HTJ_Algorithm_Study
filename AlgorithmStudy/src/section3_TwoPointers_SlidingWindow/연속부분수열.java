package section3_TwoPointers_SlidingWindow;
import java.util.*;
public class 연속부분수열 {
	public int solution(int N , int M , int[] arr) {
		int answer = 0;
		int sum = 0;
		int lt = 0;
		for(int rt = 0 ; rt < N ; rt ++ ) {
			sum+=arr[rt];
			if(sum==M) answer ++;
			while(sum >= M) {
				sum -=arr[lt++];
				if(sum==M) answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		연속부분수열 T = new 연속부분수열();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr= new int[N];
		for(int i = 0 ; i < N ; i ++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, M, arr));
	}

}
