package section9_그리디알고리즘;
import java.util.*;

class Body implements Comparable<Body>{
	public int height, weight;
	
	public Body(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Body o) {
		return o.height - this.height;
	}
}


public class 씨름선수 {
	public int solution(List<Body> list, int n) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		for (Body o: list) {
			if (o.weight > max) {
				max = o.weight;
				count ++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		씨름선수 T = new 씨름선수();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Body> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int height = scan.nextInt();
			int weight = scan.nextInt();
			list.add(new Body(height, weight));
		}
		Collections.sort(list);
		System.out.println(T.solution(list, n));
	}

}
