package section5복습;
import java.util.*;


public class 쇠막대기 {
	public int solution(String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') stack.push(s.charAt(i));
			else {
				stack.pop();
				if (s.charAt(i-1) == '(') answer += stack.size();
				else answer++;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		쇠막대기 T = new 쇠막대기();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
