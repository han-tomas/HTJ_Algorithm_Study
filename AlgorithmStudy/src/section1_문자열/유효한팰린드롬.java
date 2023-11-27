package section1_문자열;
import java.util.*;
import java.io.*;
public class 유효한팰린드롬 {
	public String solution(String str) {
		String answer ="NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String temp = new StringBuilder(str).reverse().toString();
		System.out.println(temp);
		if(str.equals(temp)) {
			answer ="YES";
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		유효한팰린드롬 T = new 유효한팰린드롬();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.print(T.solution(str));
	}

}
