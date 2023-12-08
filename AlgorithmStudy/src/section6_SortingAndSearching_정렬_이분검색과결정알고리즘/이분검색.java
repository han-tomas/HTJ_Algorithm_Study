package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
public class 이분검색 {
	public int solution(int N , int M , int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0 ; 
		int rt = N ;
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid]==M) {
				answer= mid+1;
				break;
			}
			else if(arr[mid]>M) rt = mid-1;
			else lt = mid+1;
		}
		return answer;
	}
	public static void main(String[] args) {
		이분검색 T = new 이분검색();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, M, arr));
	}

}
