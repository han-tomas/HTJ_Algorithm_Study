package section4_HashMap_TreeSet;
import java.util.*;
public class 아나그램 {
	public String solution(String s1, String s2) {
		String answer ="";
		Map<Character,Integer> map1 = new HashMap<>();
		Map<Character,Integer> map2 = new HashMap<>();		
		for(char c : s1.toCharArray()) {
			map1.put(c,map1.getOrDefault(c, 0)+1);
		}
		for(char c : s2.toCharArray()) {
			map2.put(c,map2.getOrDefault(c, 0)+1);
		}
		for(char key : s1.toCharArray()) {
			if(map1.get(key)==map2.get(key)) {
				answer = "YES";
			}
			else {
				answer="NO";
				break;
			}
		}
		return answer;
	}
	public String solution2(String s1, String s2) {
		String answer="YES";
		Map<Character,Integer> map = new HashMap<>();
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c) || map.get(c)==0) return "NO";
			map.put(c, map.get(c)-1);
		}
		return answer;
	}
	public static void main(String[] args) {
		아나그램 T = new 아나그램();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		scan.nextLine();
		String s2 = scan.next();
		System.out.println(T.solution(s1, s2));
	}

}
