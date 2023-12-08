package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
public class 마구간정하기_결정알고리즘 {
	public int count(int[] arr, int distance) {
		int count = 1;
		int ep = arr[0];
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i]-ep >= distance) {
				count++;
				ep = arr[i];
			}
		}
		return count;
	}
	public int solution(int N , int C , int[] arr) {
		int answer = 0 ;
		Arrays.sort(arr);
		int lt = arr[1]-arr[0]; // 가능한 가장 가까운 거리
		int rt = arr[N-1]-arr[0]; // 가능한 가장 먼 거리
		while(lt<=rt) {
			int mid = (lt+rt)/2; // 가장 가까운 두 말의 최대 거리
			if(count(arr, mid)>= C) { // 가장 가까운 두 말의 최대거리를 mid라 했을때, 배치할 수 있는 말의 수
				answer = mid;
				lt = mid+1;
			}
			else rt = mid-1;
		}
		return answer;
	}
	public static void main(String[] args) {
		마구간정하기_결정알고리즘 T = new 마구간정하기_결정알고리즘();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int C = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i< N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, C, arr));
	}

}
