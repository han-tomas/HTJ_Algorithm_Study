package section2_배열;
import java.io.*;
import java.util.*;
public class 뒤집은소수 {
	public boolean isPrime(int n) {
		if(n==1) return false; // 1은 소수가 아니고
		for(int i = 2; i<n ; i++) {  
			if(n%i==0) return false;
			// 2와 자신 이외의 수에서 약수가 발생하면, 소수가아니므로
		}
		return true; 
	}
	public List<Integer> solution(int N, String[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		String[] temp = new String[N];
		int[] input = new int[N];
		for(int i = 0; i<N ; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			temp[i] = sb.reverse().toString();
			input[i] = Integer.parseInt(temp[i]);
			if(isPrime(input[i])) list.add(input[i]);
				
		}
		
		return list;
	}
	public static void main(String[] args) throws IOException {
		뒤집은소수 T = new 뒤집은소수();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N ; i++) {
			arr[i] = st.nextToken();
		}
		for(int i : T.solution(N, arr)) {
			System.out.print(i+" ");
		}
		
	}

}
