package section2_배열;
import java.io.*;
import java.util.*;
public class 봉우리 {
	public int solution(int N,int[][] arr) {
		int count = 0;
		for(int i = 1 ; i<=N; i++) {
			for(int j = 1 ; j<=N ; j++) {
				if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i+1][j]
						&& arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i][j+1])
					count++;
			}
		}
		return count;
	}
	
	int[] dx = {-1,0,1,0}; // 방향좌표 만들기
	int[] dy = {0,1,0,-1};
	public int solution2(int N, int[][] arr) {
		int count = 0;
		for(int i = 0; i<N; i++) {
			for(int j = 0 ; j<N ; j++) {
				boolean flag = true;
				for(int k = 0 ; k<4 ; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx<N && ny>=0 && ny<N && arr[nx][ny] >= arr[i][j]) {
						flag=false;
						break;
					}
				}
				if(flag) count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		봉우리 T = new 봉우리();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr= new int[N+2][N+2];
		for(int i = 1 ; i<= N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j<= N; j++ ) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(N, arr));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		int[][] arr= new int[N][N];
//		for(int i = 0 ; i< N ; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			for(int j = 0 ; j< N; j++ ) {
//				arr[i][j] = Integer.parseInt(st.nextToken());
//			}
//		}
//		System.out.println(T.solution2(N, arr));
		
	}
}
