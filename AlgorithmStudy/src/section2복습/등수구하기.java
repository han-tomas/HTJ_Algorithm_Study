package section2복습;
import java.util.*;
public class 등수구하기 {
	public List<Integer> solution(int N , int[] arr){
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i<N ; i++) {
			int rank = 1;
			for(int j = 0 ; j<N ; j++) {
				if(arr[i]<arr[j]) rank++;
			}
			list.add(rank);
		}
		return list;
	}
	public static void main(String[] args) {
		등수구하기 T = new 등수구하기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++) {
			arr[i]= scan.nextInt();
		}
		for(int x : T.solution(N, arr)) {			
			System.out.print(x+" ");
		}
	}

}
