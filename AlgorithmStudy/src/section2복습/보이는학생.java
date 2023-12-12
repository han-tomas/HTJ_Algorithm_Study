package section2복습;
import java.util.*;
public class 보이는학생 {
	public int solution(int N , int[] arr) {
		int answer = 1 ;
		int max = arr[0];
		for(int i = 1 ; i<N ; i++) {
			if(arr[i]>max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		보이는학생 T = new 보이는학생();
		Scanner scan = new Scanner(System.in);
		int N  = scan.nextInt();
		int[] arr = new int[N];
		for(int i  = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, arr));
	}

}
