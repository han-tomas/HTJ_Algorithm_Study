package section2_배열;
import java.util.*;
import java.io.*;
public class 격자판최대합 {
	public int solution(int N , int[][] arr) {
		int answer = Integer.MIN_VALUE;
		
		for(int i = 0; i<N ; i++) {
			int maxA = 0; // 가로
			int maxB = 0; // 세로
			for(int j = 0 ; j<N ; j++) {
				maxA += arr[i][j];
				maxB += arr[j][i];
			}
			answer = Math.max(answer, maxA);
			answer = Math.max(answer, maxB);
		}
		int sum = 0; //좌하향 대각
		int sum2 = 0;//우상향 대각
		for(int i = 0 ; i<N ; i++) {
			sum += arr[i][i];
			sum2 += arr[i][N-i-1];
		}
		answer = Math.max(answer, sum);
		answer = Math.max(answer, sum2);
		return answer;
	}
	public static void main(String[] args) throws IOException {
		격자판최대합 T  = new 격자판최대합();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		for(int i = 0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(N, arr));
	}

}
