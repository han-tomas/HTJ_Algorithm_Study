package section3_TwoPointers_SlidingWindow;
import java.util.*;
public class 최대길이연속부분수열 {
	public int solution(int N, int K, int[] arr) {
		int answer = 0;
		int count = 0;
		int lt = 0;
		for(int rt = 0 ; rt < N ; rt ++) {
			if(arr[rt]==0) count ++;
			while(count > K){
				if(arr[lt]==0) count--;
				lt++;
			}
			answer=Math.max(answer, rt-lt+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		최대길이연속부분수열 T = new 최대길이연속부분수열();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, K, arr));
	}

}
