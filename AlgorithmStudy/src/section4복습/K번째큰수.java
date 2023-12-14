package section4복습;
import java.util.*;


public class K번째큰수 {
	public int solution(int N, int K, int[] arr) {
		int answer = -1;
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					set.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		int count = 1;
		for(int x: set) {
			if(count == K) return x;
			count++;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		K번째큰수 T = new K번째큰수();
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
