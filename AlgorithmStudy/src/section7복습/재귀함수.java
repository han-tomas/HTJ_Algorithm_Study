package section7복습;

/*
    자연수 N이 입력되면 재귀함수를 이용하여 1 부터 N 까지를
    출력하는 프로그램을 작성하세요.
 */
import java.util.*;


public class 재귀함수 {
	public void DFS(int N) {
		if(N == 0) return;
		else {
			DFS(N - 1);
			System.out.print(N + " ");
		}
	}
	
	
	public static void main(String[] args) {
		재귀함수 T = new 재귀함수();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		T.DFS(N);
	}

}
