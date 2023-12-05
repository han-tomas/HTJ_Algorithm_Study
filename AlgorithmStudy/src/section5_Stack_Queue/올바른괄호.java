package section5_Stack_Queue;
import java.util.*;
public class 올바른괄호 {
	public String solution(String input) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : input.toCharArray()) {
			if(x=='(')stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		올바른괄호 T = new 올바른괄호();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(T.solution(input));
	}

}
