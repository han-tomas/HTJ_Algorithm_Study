package section3_TwoPointers_SlidingWindow;
import java.util.*;
public class 공통원소구하기 {
	public List<Integer> solution (int N , int M , int[] arr , int[] arr2){
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int p1 = 0; 
		int p2 = 0;
		while(p1<N && p2<M) {
			if(arr[p1]==arr2[p2]) {
				list.add(arr[p1++]);
				p2++;
			}
			else if(arr[p1]<arr2[p2]) p1++;
			else p2++;
		}
		return list;
	}
	public static void main(String[] args) {
		공통원소구하기 T = new 공통원소구하기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i ++) {
			arr[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int[] arr2 = new int[M];
		for(int i = 0 ; i < M ; i++) {
			arr2[i] = scan.nextInt();
		}
		for(int i : T.solution(N, M, arr, arr2)) {
			System.out.print(i+ " ");
		}
	}

}
