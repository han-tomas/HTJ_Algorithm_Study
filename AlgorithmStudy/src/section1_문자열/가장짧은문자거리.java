package section1_문자열;
import java.util.*;
import java.io.*;
public class 가장짧은문자거리 {
	public int[] solution(String str,char c) {
		int[] answer = new int[str.length()];
		int p = 1000;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				p=0;
				answer[i]=p;
			}
			else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i)==c) {
				p=0;
				answer[i]=p;
			}
			else {
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) throws IOException {
		가장짧은문자거리 T = new 가장짧은문자거리();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str= st.nextToken();
		char c = st.nextToken().charAt(0);
		for(int i : T.solution(str, c)) {
			System.out.print(i+" ");
		}
	}

}
