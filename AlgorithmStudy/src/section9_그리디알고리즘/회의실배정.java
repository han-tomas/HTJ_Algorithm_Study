package section9_그리디알고리즘;
import java.util.*;


class Meeting implements Comparable<Meeting>{
	public int start, end;
	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Meeting o) {
		if (this.end == o.end) return this.start - o.start;
		else return this.end - o.end;
	}
}

public class 회의실배정 {
	public int solution(List<Meeting> list, int n) {
		int count = 0;
		int end = 0;
		for (Meeting m: list) {
			if(m.start >= end) {
				count ++;
				end = m.end;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		회의실배정 T = new 회의실배정();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Meeting> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int s = scan.nextInt();
			int e = scan.nextInt();
			list.add(new Meeting(s, e));
		}
		Collections.sort(list);
		System.out.println(T.solution(list, n));
	}

}
