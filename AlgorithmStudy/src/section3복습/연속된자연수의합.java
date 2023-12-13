package section3복습;
import java.util.Scanner;

public class 연속된자연수의합 {
	public int solution(int N){
		int answer = 0;
		int count = 1; // 연속된 자연수 갯수
		N --;  // N = 14
		while (N > 0) {
			count++; // count = 2  => 2개의 연속된 자연수의 합으로 표현 할 수 있는가
			N = N - count; // N -1 -2 = 12    
			if (N % count == 0) answer ++; // 12 % 2 == 0이면 가능
		}
		return answer;
	}
	public static void main(String[] args) {
		연속된자연수의합 T = new 연속된자연수의합();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(T.solution(N));
	}

}
