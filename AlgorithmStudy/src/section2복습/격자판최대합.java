package section2복습;
import java.util.*;
public class 격자판최대합 {
	public int solution(int N, int[][] arr) {
		int answer = 0 ;
		int vmax = Integer.MIN_VALUE;
		int hmax = Integer.MIN_VALUE;
		for(int i = 0 ; i<N ; i++) {
			int v = 0 ;
			int h = 0 ;
			for(int j = 0 ; j<N ; j++) {
				v += arr[i][j];
				h += arr[j][i];
			}
			vmax = Math.max(vmax, v);
			hmax = Math.max(hmax, h);
		}
		answer = Math.max(vmax, hmax);
		int cmax = Integer.MIN_VALUE;
		int c1 = 0 ;
		int c2 = 0 ;
		for(int i = 0 ; i<N ; i++) {
			c1 += arr[i][i];
			c2 += arr[N-1-i][N-1-i];
		}
		cmax = Math.max(c1, c2);
		answer = Math.max(answer, cmax);
		return answer;
	}
	public static void main(String[] args) {
		격자판최대합 T = new 격자판최대합();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] arr= new int[N][N];
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(N, arr));
		
	}
}
