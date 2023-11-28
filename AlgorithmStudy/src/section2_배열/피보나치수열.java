package section2_배열;
import java.io.*;
public class 피보나치수열 {
	public String solution(int N) {
		String answer = "";
		int[] arr = new int[N];
		arr[0]=1;
		arr[1]=1;
		for(int i = 2; i<N ; i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		for(int i = 0; i<N ; i++) {
			answer+=arr[i]+" ";
		}
		return answer;
	}
	public void solution2(int N) {
		int a = 1; 
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i = 2; i<N ; i++) {
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) throws IOException {
		피보나치수열 T = new 피보나치수열();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.print(T.solution(N));
//		T.solution2(N);
	}

}
