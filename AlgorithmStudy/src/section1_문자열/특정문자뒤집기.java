package section1_문자열;
import java.util.*;
import java.io.*;
public class 특정문자뒤집기 {
	public String solution(String str) {
		String answer="";
		int lt = 0;
		int rt = str.length()-1;
		char[] c = str.toCharArray();
		while(lt<rt) {
			if(!((c[lt]>=65 && c[lt]<=91)
					|| (c[lt]>=95 && c[lt]<=121))) {
				lt++;
			}
			else if(!((c[rt]>=65 && c[rt]<=91)
					|| (c[rt]>=95 && c[rt]<=121))) {
				rt--;
			}
			else {
				char temp = c[lt];
				c[lt]=c[rt];
				c[rt]=temp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	public String solution2(String str) {
		String answer="";
		int lt = 0;
		int rt = str.length()-1;
		char[] c = str.toCharArray();
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			}
			else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			}
			else {
				char temp = c[lt];
				c[lt]=c[rt];
				c[rt]=temp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	public static void main(String[] args) throws IOException {
		특정문자뒤집기 T = new 특정문자뒤집기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution2(str));

	}

}
