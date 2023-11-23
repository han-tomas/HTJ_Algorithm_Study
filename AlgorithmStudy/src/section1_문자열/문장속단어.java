package section1_문자열;
import java.io.*;
public class 문장속단어 {
	public String solution(String str){
		String answer="";
		String[] input = str.split(" ");
		int max = Integer.MIN_VALUE;
		for(String s : input) {
			if(max < s.length()) {
				max = s.length();
				answer = s;
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		문장속단어 T = new 문장속단어();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.print(T.solution(str));

	}

}
