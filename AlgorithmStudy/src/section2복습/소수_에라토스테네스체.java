package section2복습;
import java.util.*;
public class 소수_에라토스테네스체 {
	public int solution(int N) {
		int answer= 0;
		int[] arr = new int[N+1];
		for(int i = 2 ; i<=N; i++) {
			if(arr[i] == 0) answer ++;
			for(int j = i ; j<=N; j=j+i) {
				arr[j]=1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		소수_에라토스테네스체 T = new 소수_에라토스테네스체();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(T.solution(N));
	}

}
