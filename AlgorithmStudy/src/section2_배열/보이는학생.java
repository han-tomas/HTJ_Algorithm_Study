package section2_배열;
import java.util.*;
import java.io.*;
public class 보이는학생 {
	public int solution(int N, int[] student) {
		int answer = 1;
		boolean bCheck = false;
		for(int i = N-1 ; i>=1; i--) {
			for(int j = 0; j<i ; j++) {
				if(student[i]>student[j]) {
					bCheck=true;
				}
				else {
					 bCheck=false;
					 break;
				}
			}
			if(bCheck==true) {
				answer++;
			}
		}
		return answer;
	}
	public int solution2(int N, int[] student) {
		int answer = 1;
		int max = student[0];
		for(int i = 1; i<N ; i++) {
			if(student[i]>max) {
				answer++;
				max=student[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		보이는학생 T = new 보이는학생();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] student = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N ; i++) {
			student[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(T.solution(N, student));
		

	}

}
