package section7_Recursive_Tree_Graph__DFS_BFS기초;

public class 부분집합구하기_DFS {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L == n+1) { // 종착점에 도착했을때 => L == 4일 때
			String temp = "";
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) temp += (i+ " ");
			}
			if(temp.length() > 0) System.out.println(temp);
		}
		else {
			ch[L] = 1; // (부분집합으로) 사용한다
			DFS(L+1); // 트리의 왼쪽
			ch[L] = 0; // (부분집합으로)사용안한다
			DFS(L+1); // 트리의 오른쪽
		}
	}
	public static void main(String[] args) {
		부분집합구하기_DFS T = new 부분집합구하기_DFS();
		int n = 3;
		ch = new int[n+1];
		T.DFS(1);
	}

}
