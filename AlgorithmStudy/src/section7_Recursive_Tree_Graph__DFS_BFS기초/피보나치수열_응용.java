package section7_Recursive_Tree_Graph__DFS_BFS기초;

public class 피보나치수열_응용{
	static int[] fibo; // 전역변수로 배열 선언
	public int DFS(int n) {
		if(fibo[n] > 0) return fibo[n]; // 2. 저장된 배열 활용 ==> 시간 복잡도를 줄임
		if(n == 1) return fibo[n] = 1;
		else if(n == 2) return fibo[n] = 1;
		else return fibo[n] = DFS(n - 2) + DFS(n - 1); // 1.배열에 저장
	}
	public static void main(String[] args) {
		피보나치수열_응용 T = new 피보나치수열_응용();
		int n = 10;
		fibo = new int[n+1];
		T.DFS(n);
		for (int i = 1; i <= n ; i++) System.out.print(fibo[i]+" ");
	}

}
