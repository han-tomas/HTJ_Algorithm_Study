package section5복습;
import java.util.*;


public class 후위식연산 {
	public int solution(String s) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char c: s.toCharArray()) {
			if (Character.isDigit(c)) stack.push(c-48);
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (c == '+') stack.push(lt+rt);
				if (c == '-') stack.push(lt-rt);
				if (c == '*') stack.push(lt*rt);
				if (c == '/') stack.push(lt/rt);
			}
		}
		answer = stack.pop();
		return answer;
	}

	
	public static void main(String[] args) {
		후위식연산 T = new 후위식연산();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
