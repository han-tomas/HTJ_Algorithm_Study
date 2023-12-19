package section6복습;
import java.util.*;


public class 장난꾸러기 {
	public List<Integer> solution(int N, int[] arr){
		List<Integer> list = new ArrayList<>();
		int[] temp = arr.clone();
		Arrays.sort(temp);
		for (int i = 0; i < N; i++) {
			if (arr[i] != temp[i]) list.add(i+1);
		}
		return list;
	}
	public static void main(String[] args) {
		장난꾸러기 T = new 장난꾸러기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x: T.solution(N, arr)) System.out.print(x + " ");
	}

}
