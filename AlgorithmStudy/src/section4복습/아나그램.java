package section4복습;
import java.util.*;


public class 아나그램 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Map<Character, Integer> map = new HashMap<>();
		for (char c: s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for (char c: s2.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) == 0) return "NO";
			map.put(c, map.get(c)-1);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		아나그램 T = new 아나그램();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		System.out.println(T.solution(s1, s2));
	}

}
