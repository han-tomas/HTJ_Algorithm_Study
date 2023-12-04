package section4_HashMap_TreeSet;
import java.util.*;
public class 학급회장 {
	public char solution(int N, String s) {
		char answer = ' ';
		Map<Character, Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1); // map.getOrDefault(x, 0) map에서 
		}
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			if(map.get(key)>max) {
				max= map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		학급회장 T = new 학급회장();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String s = scan.next();
		System.out.println(T.solution(N, s));
	}

}
