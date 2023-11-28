package section2_배열;
import java.io.*;
public class 소수_에라토스테네스체 {
	public int solution(int N) { // 시간 초과
		int answer = 0;
		for(int i = 1; i<N ; i++) {
			int count = 0;
			for(int j = i ; j>=1 ; j--) {
				if(i%j==0) count++;
			}
			if(count==2) {
				answer++;
			}
		}
		return answer;
	}
	public int solution2(int N) {
		int answer = 0;
		int[] arr = new int[N+1];
		for(int i = 2 ; i<=N ; i++) {
			if(arr[i]==0) { // 처음 arr[2]=0이고, 2는 소수이기때문에 answer++
				answer++;
				for(int j=i; j<=N ; j=j+i) { 
					arr[j]=1;// 그 후, 2의 배수(arr[2j])에는 다 1을 채워줌 
				}
				// 그 다음 arr[3]=0이기 때문에, answer++ 후 3의 배수인(arr[3j])에 다 1을 채워줌
				// arr[4]는 arr[2]일 때에 의해 1이 채워져있으므로 answer++과정 생략
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		소수_에라토스테네스체 T = new 소수_에라토스테네스체();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.print(T.solution(N));
	}

}
