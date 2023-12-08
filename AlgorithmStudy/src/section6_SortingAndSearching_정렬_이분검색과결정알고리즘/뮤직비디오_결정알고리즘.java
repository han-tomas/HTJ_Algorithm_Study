package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
public class 뮤직비디오_결정알고리즘 {
	public int count(int[] arr , int capacity) {
		int count = 1, sum = 0;
		for(int x : arr) {
			if(sum + x >capacity) {
				count++;
				sum = x;
			}
			else sum+=x;
		}
		return count;
	}
	public int solution(int N , int M, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); // 배열의 최대값 구해줌
		int rt = Arrays.stream(arr).sum(); // 배열의 합을 리턴
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid) <= M) {
				answer = mid;
				rt = mid-1;
			}
			else {
				lt= mid+1;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		뮤직비디오_결정알고리즘 T = new 뮤직비디오_결정알고리즘();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for(int i  = 0 ; i<N ; i++) arr[i] = scan.nextInt();
		System.out.println(T.solution(N, M, arr));
	}

}
