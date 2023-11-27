package section1_문자열;
import java.util.*;
import java.io.*;
public class 중복문자제거 {
	public String solution(String str) {
		String answer = "";
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		answer = sb.toString();
		return answer;
	}
	public static void main(String[] args) throws IOException {
		중복문자제거 T = new 중복문자제거();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.print(T.solution(s));
	}

}
