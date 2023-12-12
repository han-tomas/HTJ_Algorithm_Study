package section2복습;
import java.util.*;
public class 큰수출력하기 {
	public List<Integer> solution(int N, int[] arr){
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i = 1 ; i < N ; i ++) {
			if(arr[i]>arr[i-1]) list.add(arr[i]);
		}
		return list;
	}
 	public static void main(String[] args) {
		큰수출력하기 T = new 큰수출력하기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i ++) {
			arr[i] = scan.nextInt();
		}
		for(int x : T.solution(N, arr)) {
			System.out.print(x+ " ");
		}
	}

}
