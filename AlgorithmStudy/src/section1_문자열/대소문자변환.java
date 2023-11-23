package section1_문자열;
import java.util.*;
public class 대소문자변환 {
	public String solution(String str) {
		String answer = "";
		for(int i = 0 ; i<str.length() ; i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=91) {
				answer+=(char)(str.charAt(i)+32);
			}
			else
				answer+=(char)(str.charAt(i)-32);
		}
		return answer;
	}
	public String solution2(String str) {
		String answer = "";
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c))
				answer+=Character.toLowerCase(c);
			else
				answer+=Character.toUpperCase(c);
		}
		return answer;
	}
	public static void main(String[] args) {
		대소문자변환 T = new 대소문자변환();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.print(T.solution2(s));

	}

}
