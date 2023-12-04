package section4_HashMap_TreeSet;
import java.util.*;
public class 모든아나그램찾기 {
	public int solution(String s1, String s2) {
		int answer = 0 ;
		Map<Character,Integer> map1 = new HashMap<>();
		Map<Character,Integer> map2 = new HashMap<>();
		for(char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		int l = s2.length()-1;
		for(int i = 0 ; i<l ; i++) {
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
		}
		int lt = 0;
		for(int rt = l; rt < s1.length(); rt ++) {
			map1.put(s1.charAt(rt), map1.getOrDefault(s1.charAt(rt), 0)+1);
			if(map1.equals(map2)) answer++;
			map1.put(s1.charAt(lt), map1.get(s1.charAt(lt))-1);
			if(map1.get(s1.charAt(lt))==0) map1.remove(s1.charAt(lt));
			lt++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		모든아나그램찾기 T = new 모든아나그램찾기();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		System.out.println(T.solution(s1, s2));
		
	}

}
