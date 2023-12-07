package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
public class 버블정렬 {
	public int[] solution(int N, int[] arr) {
		for(int i = N-1 ; i>0 ; i--) {
			for(int j = 0 ; j<i ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		버블정렬 T = new 버블정렬();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i  = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		for(int n : T.solution(N, arr)) {
			System.out.print(n+" ");
		}
	}

}
