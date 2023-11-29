package section2_배열;
import java.io.*;
import java.util.*;
public class 임시반장정하기 {
	public int solution(int N, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for(int i=1 ; i<=N ; i++) {
			int count=0;
			for(int j = 1 ; j<=N ; j++) {
				for(int k = 1; k<=5; k++) {
					if(arr[i][k]==arr[j][k]) {
						count++;
						break;
					}
				}
			}
			if(max<count) {
				answer=i;
				max=count;
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		임시반장정하기 T = new 임시반장정하기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][6];
		for(int i = 1 ; i<= N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j<=5 ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(N, arr));
		
	}

}
