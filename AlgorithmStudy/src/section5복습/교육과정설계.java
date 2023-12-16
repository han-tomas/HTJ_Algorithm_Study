package section5복습;
import java.util.*;


public class 교육과정설계 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		for (char c: s1.toCharArray()) {
			q.offer(c);
		}
		for (char c: s2.toCharArray()) {
			if (q.peek() == c) q.poll();
			if(q.isEmpty()) break;
		}
		if (!q.isEmpty()) return "NO";
		return answer;
	}
	
	
	public static void main(String[] args) {
		교육과정설계 T = new 교육과정설계();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		System.out.println(T.solution(s1, s2));
	}

}
