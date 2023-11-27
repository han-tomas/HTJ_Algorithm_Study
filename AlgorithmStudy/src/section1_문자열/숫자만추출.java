package section1_문자열;
import java.util.*;
import java.io.*;
//문자 '0'은 아스키번호로 48, '9'는 57
public class 숫자만추출 {
		public int solution(String str) {
			str = str.replaceAll("[^0-9]", "");
			int answer = Integer.parseInt(str);
			return answer;
		}
	public static void main(String[] args) throws IOException {
		숫자만추출 T = new 숫자만추출();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.print(T.solution(str));
	}

}
