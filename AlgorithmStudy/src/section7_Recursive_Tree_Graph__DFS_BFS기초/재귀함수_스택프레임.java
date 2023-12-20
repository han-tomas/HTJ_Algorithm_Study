package section7_Recursive_Tree_Graph__DFS_BFS기초;

public class 재귀함수_스택프레임 {
	public void DFS(int n) { // Depth-first Search 깊이 우선 탐색
		if(n == 0) return; // n == 0 이면 line 10으로 이동후 pop
		else {	
			DFS(n-1); // 자기 자신 호출 --> line 4로 이동
			System.out.print(n + " "); // DFS(0) pop 된 이후로,
									   // DFS(1)의 line 8 실행후 pop
									   // DFS(2)의 line 8 실행후 pop
									   // DFS(3)의 line 8 실행후 pop
		}
	}
	
	
	public static void main(String[] args) {
		재귀함수_스택프레임 T = new 재귀함수_스택프레임();
		T.DFS(3);
	}

}
