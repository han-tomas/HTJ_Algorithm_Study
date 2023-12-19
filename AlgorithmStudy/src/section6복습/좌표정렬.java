package section6복습;
import java.util.*;


class Point implements Comparable<Point>{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y - o.y;
		else return this.x - o.x;
	}
}


public class 좌표정렬 {
	public List<Integer> solution(int N, int[][] arr){
		List<Integer> list = new ArrayList<>();
		return list;
	}
	public static void main(String[] args) {
		좌표정렬 T = new 좌표정렬();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Point> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.add(new Point(x, y));
		}
		Collections.sort(list);
		for (Point o: list) {
			System.out.println(o.x + " " + o.y);
		}
	}

}
