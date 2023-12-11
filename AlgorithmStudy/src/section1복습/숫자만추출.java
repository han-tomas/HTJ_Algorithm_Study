package section1복습;
import java.util.*;
public class 숫자만추출 {
	public int solution(String s) {
		int answer = 0;
		s = s.replaceAll("[^0-9]", "");
		answer = Integer.parseInt(s);
		return answer;
	}
	public int solution2(String s) {
		int answer = 0 ;
		for(char x : s.toCharArray()) {
			if(48<=x && x<=57) {
				answer = answer*10+(x-48);
			}
		}
		return answer;
	}
	public int solution3(String s) {
		String answer = "" ;
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {
		숫자만추출 T = new 숫자만추출();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
