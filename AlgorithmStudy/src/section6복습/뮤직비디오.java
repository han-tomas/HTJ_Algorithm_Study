package section6복습;
import java.util.*;


public class 뮤직비디오 {
	public int count(int[] arr, int capacity) {
		int count = 1;
		int sum = 0;
		for (int x: arr) {
			if (sum + x > capacity) {
				count ++;
				sum = x;
			}
			else sum += x;
		}
		return count;
	}
	
	
	public int solution(int N, int M, int[] arr) {
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
		뮤직비디오 T = new 뮤직비디오();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		int M = scan.nextInt();
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, M, arr));
	}

}
