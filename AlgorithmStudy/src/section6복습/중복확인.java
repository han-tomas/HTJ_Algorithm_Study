package section6복습;
import java.util.*;


public class 중복확인 {
	public char solution(int N, int[] arr) {
		char answer = 'U';
		Arrays.sort(arr);
		for (int i = 0; i < N - 1; i++) {
			if (arr[i] == arr[i+1]) return 'D';
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		중복확인 T = new 중복확인();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, arr));
	}

}
