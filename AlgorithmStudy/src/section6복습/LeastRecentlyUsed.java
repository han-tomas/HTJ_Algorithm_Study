package section6복습;
import java.util.*;
public class LeastRecentlyUsed {
	public int[] solution(int S, int N, int[] arr) {
		int[] cache = new int[S];
		for (int x: arr) {
			int pos = -1;
			for (int i = 0; i < S; i++) {
				if (x == cache[i]) pos = i; // cache에 x값이 존재 할 때
											// pos를 x값이 존재하는 index번호로
			} 
			if (pos == -1) { // pos == -1 라는건, cache에 x값이 존재하지 않는 상황
				for (int i = S - 1; i >= 1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
			else {
				for (int i = pos; i >= 1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
		}
		return cache;
	}
	public static void main(String[] args) {
		LeastRecentlyUsed T = new LeastRecentlyUsed();
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int N = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x: T.solution(S, N, arr)) System.out.print(x + " ");
	}

}
