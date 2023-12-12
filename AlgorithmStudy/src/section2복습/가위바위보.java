package section2복습;
import java.util.*;
public class 가위바위보 {
	public List<Character> solution(int N ,int[] a, int[] b){
		List<Character> list = new ArrayList<>();
		for(int i = 0 ; i < N  ; i++) {
			if(a[i]-b[i] == 1 || b[i]-a[i] == 2) list.add('A');
			else if(b[i]-a[i] == 1 || a[i]-b[i] == 2) list.add('B');
			else list.add('D');
		}
		return list;
	}
	public static void main(String[] args) {
		가위바위보 T = new 가위바위보();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i =  0 ; i < N ; i++) a[i] = scan.nextInt();
		for(int i =  0 ; i < N ; i++) b[i] = scan.nextInt();
		for(char x : T.solution(N, a, b)) {
			System.out.println(x);
		}
	}

}
