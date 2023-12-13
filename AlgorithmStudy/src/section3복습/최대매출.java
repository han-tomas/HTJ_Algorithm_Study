package section3복습;
import java.util.*;
public class 최대매출 {
	public int solution(int N, int K, int[] arr) {
		int answer = 0;
		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum+=arr[i];
		}
		int max = sum;
		int lt = 0;
		for (int rt = K; rt < N; rt++) {
			sum+=arr[rt]-arr[lt];
			lt++;
			if (max < sum) max = sum;
		}
		answer = max;
		return answer;
	}
	public static void main(String[] args) {
		최대매출 T = new 최대매출();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, K, arr));
	}

}
