package section1복습;
import java.util.*;
public class 유효한팰린드롬 {
	public String solution(String s) {
		String answer = "YES";
		s = s.toUpperCase();
		s = s.replaceAll("[^A-Z]", "");
		String temp = new StringBuffer(s).reverse().toString();
		if(!s.equalsIgnoreCase(temp)) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		유효한팰린드롬 T = new 유효한팰린드롬();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(T.solution(s));
	}
}
