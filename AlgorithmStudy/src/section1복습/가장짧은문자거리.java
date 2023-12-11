package section1복습;
import java.util.*;
public class 가장짧은문자거리 {
	public int[] solution(String s, char c) {
		int[] arr = new int[s.length()];
		int p = 1000;
		for(int i = 0 ; i< s.length() ; i++) {
			if(s.charAt(i)==c) {
				p = 0 ;
				arr[i] = p;
			}
			else {
				p++;
				arr[i]=p;
			}
		}
		for(int i = s.length()-1; i>=0 ;  i--) {
			if(s.charAt(i)==c) {
				p = 0 ;
				arr[i] = p;
			}
			else {
				p++;
				arr[i] = Math.min(arr[i], p);
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		가장짧은문자거리 T = new 가장짧은문자거리();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char c = scan.next().charAt(0);
		for(int x : T.solution(s, c)) {
			System.out.print(x+" ");
		}
	}

}
