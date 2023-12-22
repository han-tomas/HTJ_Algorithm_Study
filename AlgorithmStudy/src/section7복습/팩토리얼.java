package section7복습;
/*
	자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
	예를 들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 
 */
import java.util.*;


public class 팩토리얼 {
	public int DFS(int N) {
		if (N == 1) {
			System.out.print(1 + " = ");
			return 1;
		}
		else {
			System.out.print(N + " * ");
			return N * DFS(N-1);
		}
	}
	
	
	public static void main(String[] args) {
		팩토리얼 T = new 팩토리얼();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.print(N + "! = ");
		System.out.println(T.DFS(N));
	}

}
