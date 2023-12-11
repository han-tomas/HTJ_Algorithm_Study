package section1복습;
import java.util.*;
public class 문자열압축 {
	public String solution(String s) {
		String answer="";
		s = s+" "; // 맨끝에 공백 추가
		int count =1;
		for(int i = 0 ; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) count ++;
			else {
				answer += s.charAt(i);
				if(count != 1) {
					answer += count;
					count = 1;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		문자열압축 T = new 문자열압축();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
