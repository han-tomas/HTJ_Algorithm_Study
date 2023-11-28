package section2_배열;
import java.util.*;
public class 가위바위보 {
	public String solution(int N,int[] A, int[] B) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<N ;i++) {
			if((Math.abs(A[i]-B[i]))==2) {
				if(A[i]>B[i]) sb.append("B").append("\n");
				else sb.append("A").append("\n");	
			}
			else if((Math.abs(A[i]-B[i]))==1) {
				if(A[i]>B[i]) sb.append("A").append("\n");
				else sb.append("B").append("\n");
			}
			else {
				sb.append("D").append("\n");
			}
		}
		answer =sb.toString();
		return answer;
	}
	public static void main(String[] args) {
		가위바위보 T = new 가위바위보();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		StringTokenizer st = new StringTokenizer(scan.nextLine());
		int[] A = new int[N];
		for(int i = 0; i<N ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(scan.nextLine());
		int[] B = new int[N];
		for(int i = 0; i<N ; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(T.solution(N, A, B));
	}

}
