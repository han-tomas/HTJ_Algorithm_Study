package section5복습;
import java.util.*;


public class 괄호문자제거 {
	public String solution(String s) {
		String answer ="";
		Stack<Character> stack = new Stack<>();
		for (char c: s.toCharArray()) {
			if(c==')') while(stack.pop() != '(');
			else stack.push(c);
		}
		for (char x: stack) {
			answer += x;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		괄호문자제거 T = new 괄호문자제거();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
