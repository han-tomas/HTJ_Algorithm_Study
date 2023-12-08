package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.util.*;
class Point implements Comparable<Point>{
	public int x,y;
	public Point( int x , int y) {
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
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Point> list = new ArrayList<>();
		for(int i  = 0 ; i< N ; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.add(new Point(x, y));
		}
		Collections.sort(list);
		for(Point o : list) {
			System.out.println(o.x+" "+o.y);
		}
	}

}
