package section1복습;
import java.util.*;
public class 중복문자제거 {
	public String solution(String s) {
		String answer = "";
		Set<Character> set = new LinkedHashSet<>();
		for(char x : s.toCharArray()) {
			set.add(x);
		}
		for(char x : set) {
			answer +=x;
		}
		return answer;
	}
	public String solution2(String s) {
		String answer ="";
		for(int i = 0 ; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i))==i) answer += s.charAt(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		중복문자제거 T = new 중복문자제거();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution2(s));
	}

}
