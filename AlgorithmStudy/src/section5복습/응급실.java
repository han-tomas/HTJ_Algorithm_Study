package section5복습;
import java.util.*;
class Person{
	int order;
	int warn;
	public Person(int order, int warn) {
		this.order = order;
		this.warn = warn;
	}
}
public class 응급실 {
	public int solution(int N, int M, int[] arr) {
		int answer = 0;
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			q.offer(new Person(i,arr[i]));
		}
		while(!q.isEmpty()) {
			Person temp = q.poll(); // temp = (0,60)
			for (Person x: q) { //x = (2,70)
				if(x.warn > temp.warn) {
					q.offer(temp);
					temp = null;
					break;
				}
			}
			if(temp != null) {
				answer ++;
				if(temp.order == M) return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		응급실 T = new 응급실();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr= new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(N, M, arr));
	}

}
