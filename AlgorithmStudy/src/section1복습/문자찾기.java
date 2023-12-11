package section1복습;
import java.util.*;
public class 문자찾기 {
	public int solution(String input, char c) {
		int answer = 0;
		input = input.toUpperCase();
		c = Character.toUpperCase(c);
		for(char x : input.toCharArray()) {
			if(x == c) answer ++;
		}
		return answer;
	}
	public static void main(String[] args) {
		문자찾기 T = new 문자찾기();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char c = scan.next().charAt(0);
		System.out.println(T.solution(input, c));
	}

}
