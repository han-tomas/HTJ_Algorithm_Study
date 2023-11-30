package section3_TwoPointers_SlidingWindow;
import java.util.*;
public class 최대매출 {
	public int solution(int N, int K, int[] arr) {
		int max = 0;
		int sum = 0;
		for(int i = 0 ; i < K ; i++) sum +=arr[i];
		max = sum;
		for(int i = K ; i < N ; i++) {
			sum += (arr[i]-arr[i-K]);
			max = Math.max(max, sum);
		}
		return max;
	}
	public static void main(String[] args) {
		최대매출 T = new 최대매출();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] arr = new int[N];
		for(int i  = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, K, arr));
	}

}
