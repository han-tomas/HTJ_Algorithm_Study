package section1복습;
import java.util.*;
public class 대소문자변환 {
	public String solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
	public static void main(String[] args) {
		대소문자변환 T = new 대소문자변환();
		Scanner scan = new Scanner(System.in);
		String s= scan.next();
		System.out.println(T.solution(s));
	}
}
