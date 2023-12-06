package section5_Stack_Queue;
import java.util.*;
public class 교육과정설계 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : s1.toCharArray()) Q.offer(x);
		for(char x : s2.toCharArray()) {
			if(Q.contains(x)) {
				if(x!=Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
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
