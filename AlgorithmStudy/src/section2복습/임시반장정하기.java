package section2복습;
import java.util.*;
public class 임시반장정하기 {
	public int solution(int N, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i<N ; i++) {
			int count = 0 ;
			for(int j = 0 ; j<N ; j++) {
				for(int k = 0 ; k<5 ; k++) {
					if(arr[i][k]==arr[j][k]) {
						count++;
						break;
					}
				}	
			}
			if(count>max) {
				answer = i+1;
				max = count;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		임시반장정하기 T = new 임시반장정하기();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] arr = new int[N][5];
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<5 ; j++) {
				arr[i][j]= scan.nextInt();
			}
		}
		System.out.println(T.solution(N, arr));
	}

}
