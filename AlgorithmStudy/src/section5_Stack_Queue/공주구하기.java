package section5_Stack_Queue;
import java.util.*;
public class 공주구하기 {
	public int solution(int N, int K) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1 ; i <= N ; i++) queue.offer(i);
		while(!queue.isEmpty()) {
			for(int i = 1 ; i<K ; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();
			if(queue.size()==1) answer = queue.poll();
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
