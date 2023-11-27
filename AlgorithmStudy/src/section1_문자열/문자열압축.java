package section1_문자열;
import java.util.*;
import java.io.*;
public class 문자열압축 {
	public String solution(String str) {
		String answer="";
		int i = 0;
		while(i<str.length()) {
			int count = 1;
			for(int j = i+1; j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				else {
					break;
				}
			}
			answer+=str.charAt(i);
			if(count!=1)
				answer+=count;
			i+=count;
				
		}
		return answer;
	}
	public String solution2(String str) {
		String answer="";
		str = str+" ";
		int count = 1;
		for(int i = 0; i<str.length()-1; i++) { // " " 제외한 범위
			if(str.charAt(i)==str.charAt(i+1)) { // 문자가 뒷순서에 오는 문자와 같을때 count ++
				count ++;
			}
			else {
				answer+=str.charAt(i); // 다르면 문자 문자 출력, 끝에문자는 " "이기 때문에 무조건 다름
				if(count != 1) { // count가 1이 아니면
					answer+=count; // count된 숫자도 출력
					count = 1; // 다시 1로 초기화
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		문자열압축 T = new 문자열압축();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution2(str));
	}

}
