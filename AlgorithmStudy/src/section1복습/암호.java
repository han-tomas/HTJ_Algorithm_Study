package section1복습;
import java.util.*;
public class 암호 {
	public String solution(int N, String s) {
		String answer = "";
		for(int i = 0 ; i<N ; i++) {
			String temp = s.substring(0,7);
			temp = temp.replace("#", "1").replace("*", "0");
			s = s.substring(7);
			int asc = Integer.parseInt(temp,2);
			answer+=(char)asc;
		}
		return answer;
	}
	public static void main(String[] args) {
		암호 T = new 암호();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String s = scan.next();
		System.out.println(T.solution(N, s));
	}

}
