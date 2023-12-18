package section6복습;
import java.util.*;


public class 선택정렬 {
	public int[] solution(int N, int[] arr) {
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		선택정렬 T = new 선택정렬();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x: T.solution(N, arr)) System.out.print(x+" ");
	}

}
