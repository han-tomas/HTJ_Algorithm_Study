package section1복습;
import java.util.*;
public class 문장속단어 {
	public String solution(String s) {
		String answer = "";
		String[] input = s.split(" ");
		int max = Integer.MIN_VALUE;
		for(String x : input) {
			if(x.length()>max) {
				max = x.length();
				answer = x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		문장속단어 T = new 문장속단어();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(T.solution(s));
	}

}
