package section6_SortingAndSearching_정렬_이분검색과결정알고리즘;
import java.io.*;
import java.util.*;
public class 선택정렬 {
	public int[] solution(int N, int[] arr) {
		for(int i = 0 ; i<N ; i++) {
			for(int j = i+1 ;j<N ;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) throws IOException {
		선택정렬 T = new 선택정렬();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N ; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int n : T.solution(N, arr)) {
			System.out.print(n+" ");
		}
	}

}
