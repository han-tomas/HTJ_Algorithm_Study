package section7복습;
/*
	1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여
	   다음 숫자가 되는 수열이다.
	2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 
	   1 1 2 3 5 8 13을 출력하면 된다.
	<응용> 배열 이용 (시간 단축)
 */
import java.util.*;


public class 피보나치수열_응용 {
	static int[] fibo;
	public int DFS(int N) {
		if(fibo[N] > 0) return fibo[N];
		if(N == 1) return fibo[N] = 1;
		else if (N == 2) return fibo[N] = 1;
		else return fibo[N] = DFS(N-2) + DFS(N-1);
	}
	
	
	public static void main(String[] args) {
		피보나치수열_응용 T = new 피보나치수열_응용();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		fibo = new int[N+1];
		for (int i = 1; i <= N; i++) System.out.print(T.DFS(i)+" ");
	}

}
