package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
public class 중복확인 {
	public char solution(int N , int[] arr) {
		char answer ='U';
		Map<Integer,Integer> map = new HashMap<>();
		for(int x:arr) {
			map.put(x, map.getOrDefault(x, 0)+1);
			if(map.get(x)==2) return 'D';
		}
		return answer;
	}
	public char solution2(int N, int[] arr) {
		char answer ='U';
		Arrays.sort(arr);
		for(int i = 0 ; i < N-1; i++) {
			if(arr[i] == arr[i+1]) return 'D';
		}
		return answer;
	}
	public static void main(String[] args) {
		중복확인 T = new 중복확인();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print(T.solution2(N, arr));
	}

}
