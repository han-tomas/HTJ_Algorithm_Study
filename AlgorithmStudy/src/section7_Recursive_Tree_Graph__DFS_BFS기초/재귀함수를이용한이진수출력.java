package section7_Recursive_Tree_Graph__DFS_BFS기초;

public class 재귀함수를이용한이진수출력 {
	public void DFS(int n) {
		if(n/2 == 0) {
			System.out.print(n%2);
			return;
		}
		else {
			DFS(n/2);
			System.out.print(n%2);			
		}
	}
	public static void main(String[] args) {
		재귀함수를이용한이진수출력 T = new 재귀함수를이용한이진수출력();
		T.DFS(11);
	}
 
}
