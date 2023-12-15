package section5복습;
import java.util.*;


public class 공주구하기 {
	public int solution(int N, int K) {
		int answer= 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i<=N ;i++) q.offer(i);
		while (!q.isEmpty()) {
			for(int i = 1 ; i<K ; i++) {
				q.offer(q.poll());
			}
			q.poll();
			if(q.size()==1) answer = q.poll();
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		공주구하기 T = new 공주구하기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		System.out.println(T.solution(N, K));
	}

}
