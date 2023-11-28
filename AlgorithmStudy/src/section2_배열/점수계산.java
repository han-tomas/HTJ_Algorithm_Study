package section2_배열;
import java.io.*;
import java.util.StringTokenizer;
public class 점수계산 {
	public int solution(int N , int[] arr) {
		int score = 0;
		int count = 0;
		for(int i = 0 ; i<N ; i++) {
			if(arr[i]==1) {
				count++;
				score+=count;
			}
			else {
				count=0;
			}
		}
		return score;
	}
	public static void main(String[] args) throws IOException {
		점수계산 T = new 점수계산();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		System.out.println(T.solution(N, arr));
	}

}
