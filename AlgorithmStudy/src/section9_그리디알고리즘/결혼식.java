package section9_그리디알고리즘;
import java.util.*;


class Party implements Comparable<Party>{
	public int time;
	public char state;
	public Party(int time, char state) {
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Party o) {
		if (this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
}

public class 결혼식 {
	public int solution(List<Party> list) {
		int answer = Integer.MIN_VALUE;
		int count = 0;
		for (Party o: list) {
			if (o.state == 's') count ++;
			else count --;
			answer = Math.max(answer, count);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		결혼식 T = new 결혼식();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Party> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int s = scan.nextInt();
			int e = scan.nextInt();
			list.add(new Party(s, 's'));
			list.add(new Party(e, 'e'));
		}
		Collections.sort(list);
		System.out.println(T.solution(list));
	}
}
