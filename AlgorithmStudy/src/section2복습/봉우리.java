package section2복습;
import java.util.*;
public class 봉우리 {
	int[] dx = {-1,0,1,0};
	int[] dy = {0,-1,0,1};
			//  상,좌,하,우
	public int solution(int N, int[][] arr) {
		int answer = 0 ;
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				boolean bCheck = true;
				for(int k = 0 ; k<4 ; k++) {
					int x = i+dx[k];
					int y = j+dy[k];
					if(x>=0 && x<N && y>=0 && y<N && arr[i][j]<=arr[x][y]) {
						bCheck = false;
						break;
					}
				}
				if(bCheck) answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		봉우리 T = new 봉우리();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] arr= new int[N][N];
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(N, arr));
	}

}
