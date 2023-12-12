package section2복습;
import java.util.*;
public class 뒤집은소수 {
	public boolean isPrime(int n) {
		boolean isPrime = true;
		if(n == 1) return false;
		else {
			for(int i = 2; i<n ; i++) {
				if(n%i==0) return false;
			}
		}
		return isPrime;
	}
	public List<Integer> solution(int N, String[] arr){
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i<N ; i++) {
			String s = new StringBuffer(arr[i]).reverse().toString();
			int n = Integer.parseInt(s);
			if(isPrime(n)) list.add(n);
		}
		return list;
	}
	public List<Integer> solution2(int N, String[] arr){
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i<N ; i++) {
			String s = new StringBuffer(arr[i]).reverse().toString();
			int n = Integer.parseInt(s);
			boolean isPrime = true;
			for(int j = 2 ; j<n ; j++) {
				if(n%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(n!=1 && isPrime) list.add(n);
		}
		return list;
	}
	public static void main(String[] args) {
		뒤집은소수 T = new 뒤집은소수();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] arr = new String[N];
		for(int i = 0 ; i<N ; i++) {
			arr[i] = scan.next();
		}
		for(int x : T.solution(N, arr))
			System.out.print(x+" ");
	}

}
