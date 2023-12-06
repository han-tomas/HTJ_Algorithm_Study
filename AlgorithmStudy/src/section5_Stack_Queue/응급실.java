package section5_Stack_Queue;
import java.util.*;
class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id=id;
		this.priority= priority;
	}
}
public class 응급실 {
	public int solution(int N, int M, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		for(int i = 0 ; i<N ; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()) {
			Person temp = Q.poll();
			for(Person x: Q) {
				if(x.priority>temp.priority) {
					Q.offer(temp);
					temp = null;
					break;
				}
			}
			if(temp!=null) {
				answer++;
				if(temp.id == M) return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		응급실 T = new 응급실();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i<N ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print(T.solution(N, M, arr));
	}

}
