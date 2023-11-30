package section2_배열;
import java.util.*;
import java.io.*;
public class 멘토링 {
	public int solution(int N, int M, int[][] arr) {
		int answer = 0 ;
		for(int i = 1; i <= N ; i++) { // ( 멘토 , 멘티 ) => ( i , j )
			for(int j = 1 ; j <= N ; j++) {
				int count = 0;
				for(int k  = 0 ; k < M ; k++) {
					int irank = 0;
					int jrank = 0;
					for(int s = 0 ; s < N ; s++) {
						if(arr[k][s]==i) irank = s;
						if(arr[k][s]==j) jrank = s;
					}
					if(irank<jrank) count++;
				}
				if(count==M) { // irank가 jrank보다 높은 횟수가 시험횟수 M번(전체)를 만족할 때
					answer++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		멘토링 T = new 멘토링();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[M][N];
		for(int i = 0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j<N ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(N, M, arr));		
	}
}
