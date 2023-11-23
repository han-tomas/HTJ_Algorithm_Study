package section1_문자열;
import java.util.*;
import java.io.*;
public class 문자찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char c = br.readLine().charAt(0);
		s = s.toUpperCase();
		c = Character.toUpperCase(c);
		int answer = 0;
		for(int i  = 0 ; i<s.length(); i++) {
			if(s.charAt(i)==c)
				answer++;
		}
		System.out.println(answer);

	}

}
