package section3복습;
import java.util.*;
public class 두배열합치기 {
	public List<Integer> solution(int N, int M, int[] arr1, int[] arr2){
		List<Integer> list = new ArrayList<>();
		int p1 = 0; 
		int p2 = 0;
		while (p1 < N && p2 < M) {
			if (arr1[p1] < arr2[p2]) {
				list.add(arr1[p1++]);
			}
			else {
				list.add(arr2[p2++]);
			}
		}
		while (p1 < N) list.add(arr1[p1++]);
		while (p2 < M) list.add(arr2[p2++]);
		return list;
	}
	public static void main(String[] args) {
		두배열합치기 T = new 두배열합치기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int[] arr2 = new int[M];
		for (int j = 0; j < M; j++) {
			arr2[j] = scan.nextInt();
		}
		for (int x: T.solution(N, M, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}

}
