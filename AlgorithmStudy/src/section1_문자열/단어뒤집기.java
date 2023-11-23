package section1_문자열;
import java.io.*;
import java.util.*;
public class 단어뒤집기 {
	public String solution(String str) {
		String answer = "";
		StringBuilder sb = new StringBuilder(str);
		answer= sb.reverse().toString();
		return answer;
	}
	public static void main(String[] args) throws IOException {
		단어뒤집기 T = new 단어뒤집기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<N ; i++) {
			String str = br.readLine();
			System.out.println(T.solution(str));
		}

	}

}
