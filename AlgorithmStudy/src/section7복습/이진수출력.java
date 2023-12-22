package section7복습;
/*
  	10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
  	단, 재귀함수를 이용해서 출력해야 합니다.
 */
import java.util.*;


public class 이진수출력 {
	public void DFS(int N) {
		if (N == 0) return;
		else {
			DFS(N / 2);
			System.out.print(N % 2 + " ");
		}
	}
	
	
	public static void main(String[] args) {
		이진수출력 T = new 이진수출력();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		T.DFS(N);
	}

}
