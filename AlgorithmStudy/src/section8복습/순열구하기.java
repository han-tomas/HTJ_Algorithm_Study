package section8복습;
import java.util.*;


public class 순열구하기 {
	static int n, m;
	static int[] arr, ch, pm;
	public void DFS(int L) {
		if(L == m) {
			for(int x: pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					pm[L] = arr[i];
					ch[i] = 1;
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		순열구하기 T = new 순열구하기();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		arr = new int[n];
		ch = new int[n];
		pm = new int[m];
		for (int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		T.DFS(0);
		
		
	}

}
