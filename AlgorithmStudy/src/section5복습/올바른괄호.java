package section5복습;
import java.util.*;
public class 올바른괄호 {
	public String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (char c: s.toCharArray()) {
			if(c=='(') stack.push(c);
			else {
				if(stack.isEmpty()) return "NO";
				else stack.pop();
			}
		}
		if (!stack.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		올바른괄호 T = new 올바른괄호();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
