package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
public class 삽입정렬 {
	public int[] solution(int N, int[] arr) {
		for(int i = 1; i<N ; i++) {
			int temp = arr[i];
			for(int j = i-1 ; j>=0 ; j--) {
				if(arr[j]>temp) {
					arr[j+1]=arr[j];
					arr[j]=temp;  
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		삽입정렬 T = new 삽입정렬();
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
