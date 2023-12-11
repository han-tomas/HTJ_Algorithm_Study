package section1복습;
import java.util.*;
public class 단어뒤집기 {
	public List<String> solution(String[] s) {
		List<String> list = new ArrayList<>();
		for(String x : s) {
			StringBuffer sb = new StringBuffer(x);
			list.add(sb.reverse().toString());
		}
		return list;
	}
	public List<String> solution2(String[] s) {
		List<String> list = new ArrayList<>();
		for(String x : s) {
			char[] c =x.toCharArray();
			int lt = 0;
			int rt = x.length()-1;
			while(lt<rt) {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				rt--;
				lt++;
			}
			String answer = String.valueOf(c);
			list.add(answer);
		}
		return list;
	}
	public static void main(String[] args) {
		단어뒤집기 T = new 단어뒤집기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] s = new String[N];
		for(int i = 0 ; i < N ; i++) {
			s[i] = scan.next();
		}
		for(String x : T.solution(s)) {
			System.out.println(x);
		}
	}

}
