package section1복습;
import java.util.*;
public class 특정문자뒤집기 {
	public String solution(String s) {
		String answer = "";
		int lt = 0;
		int rt = s.length()-1;
		char[] c = s.toCharArray();
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				rt--;
				lt++;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	public static void main(String[] args) {
		특정문자뒤집기 T = new 특정문자뒤집기();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(T.solution(s));
	}

}
