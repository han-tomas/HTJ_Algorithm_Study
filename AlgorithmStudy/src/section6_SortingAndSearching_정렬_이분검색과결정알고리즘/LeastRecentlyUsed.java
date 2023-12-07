package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
public class LeastRecentlyUsed {
	public int[] solution(int S, int N , int[] arr) {
		int[] answer = new int[S];
		for(int x : arr) {
			int idx =-1;
			for(int i = 0 ; i<S ; i++) if(x==answer[i]) idx=i; // answer 배열안에 x 값이 있으면
			if(idx==-1) { // 같은게 없는 상황
				for(int i = S-1; i>=1 ; i--) {
					answer[i] = answer[i-1];
				}
				answer[0]=x;
			}
			else {
				for(int i = idx; i>=1 ; i--) {
					answer[i] = answer[i-1];
				}
				answer[0]=x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		LeastRecentlyUsed T = new LeastRecentlyUsed();
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		for(int n : T.solution(S, N, arr)) System.out.print(n+" ");
	}

}
