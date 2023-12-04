package section4_HashMap_TreeSet;
import java.util.*;

public class 매출액의종류 {
	public List<Integer> solution(int N, int K, int[] arr){
		List<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<K-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0;
		for(int rt = K-1; rt<N; rt ++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			list.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		return list;
	}
	public static void main(String[] args) {
		매출액의종류 T = new 매출액의종류();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] arr = new int[N];
		for(int i  = 0 ; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i :T.solution(N, K, arr)) {
			System.out.print(i+" ");
		}
	}

}
