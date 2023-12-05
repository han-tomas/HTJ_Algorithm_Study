package section5_Stack_Queue;
import java.util.*;
public class 후위식연산_postfix {
	public int solution(String s) {
		int answer = 0 ; 
		Stack<Integer> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c)) stack.push(c-48);// '0'이 48이기 때문에
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(c=='+') stack.push(lt+rt);
				if(c=='-') stack.push(lt-rt);
				if(c=='*') stack.push(lt*rt);
				if(c=='/') stack.push(lt/rt);
			}
		}
		answer = stack.get(0);
		return answer;
	}
	public static void main(String[] args) {
		후위식연산_postfix T = new 후위식연산_postfix();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
