package section1복습;
import java.util.*;
public class 회문문자열 {
	public String solution(String s) {
		String answer ="YES";
		s = s.toUpperCase();
		char[] c = s.toCharArray();
		int lt = 0 ; 
		int rt = s.length()-1;
		while(lt<rt) {
			if(c[lt] == c[rt]) {
				lt++;
				rt--;
			}
			else return "NO";
			
		}
		return answer;
	}
	public String solution2(String s) {
		String answer ="YES";
		String temp = new StringBuffer(s).reverse().toString();
		if(!s.equalsIgnoreCase(temp)) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		회문문자열 T = new 회문문자열();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution2(s));
	}

}
