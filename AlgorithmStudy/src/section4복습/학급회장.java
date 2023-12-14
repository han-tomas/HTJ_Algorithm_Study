package section4복습;
import java.util.*;


public class 학급회장 {
	public char solution(int N, String s) {
		char answer = ' ';
		Map<Character,Integer> map = new HashMap<>();
		for (char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		int max = Integer.MIN_VALUE;
		for (char key: map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
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
