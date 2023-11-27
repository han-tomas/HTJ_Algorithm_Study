package section1_문자열;
import java.util.*;
import java.io.*;
public class 회문문자열 {
	public String solution(String str) {
		String answer = "";
		str = str.toUpperCase();
		int lt = 0;
		int rt = str.length()-1;
		while(lt<rt) {
			if(str.charAt(lt) == str.charAt(rt)) {
				lt++;
				rt--;
				answer= "YES";
				
			}
			else {
				answer= "NO";
				break;
			}
		}
		return answer;
	}
	public String solution2(String str) {
		String answer ="NO";
		String temp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(temp))
			answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		회문문자열 T = new 회문문자열();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.print(T.solution(str));
	}

}
