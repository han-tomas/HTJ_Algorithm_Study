package section5_Stack_Queue;
import java.util.*;
public class 괄호문자제거 {
	public String solution(String input) {
		String answer="";
		Stack<Character> stack = new Stack<>();
		for(char c : input.toCharArray()) {
			if(c==')') {
				while(stack.pop()!='(');
			}
			else stack.push(c);
		}
		for(char c : stack) {
			answer+=c;
		}
		return answer;
	}
	public static void main(String[] args) {
		괄호문자제거 T = new 괄호문자제거();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(T.solution(input));
	}

}
