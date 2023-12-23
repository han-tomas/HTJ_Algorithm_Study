package section7복습;

import java.util.Scanner;

public class 부분집합구하기_DFS {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		String temp = "";
		if(L == n+1) {
			for(int i = 1; i <= n; i++) {
				if (ch[i] == 1) temp += (i + " ");
			}
			System.out.println(temp);
		}
		else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	
	
	public static void main(String[] args) {
		부분집합구하기_DFS T = new 부분집합구하기_DFS();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		ch = new int[n+1];
		T.DFS(1);
	}

}
