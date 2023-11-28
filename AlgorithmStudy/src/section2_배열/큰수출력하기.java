package section2_배열;
import java.io.*;
import java.util.*;
public class 큰수출력하기 {
	public String solution(int N, int[] arr) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append(" ");
		for(int i = 1; i<N ; i++) {
			if(arr[i]>arr[i-1]) {
				sb.append(arr[i]).append(" ");
			}
		}
		answer = sb.toString();
		return answer;
	}
	public static void main(String[] args) throws IOException {
		큰수출력하기 T = new 큰수출력하기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(T.solution(N, arr));
	}

}
