package section3_TwoPointers_SlidingWindow;
import java.util.*;
import java.io.*;
public class 두배열합치기 {
	public List<Integer> solution(int N , int M , int[] arr, int[] arr2){
		List<Integer> list= new ArrayList<Integer>();
		int p1 = 0;
		int p2 = 0;
		while(p1<N && p2<M) {
			if(arr[p1]<arr2[p2]) list.add(arr[p1++]);
			else list.add(arr2[p2++]);
		}
		while(p1<N) list.add(arr[p1++]);
		while(p2<M) list.add(arr2[p2++]);
		return list;
	}
	public static void main(String[] args) throws IOException {
		// TwoPointer 형식이 더 빠르다.
		두배열합치기 T = new 두배열합치기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M ; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		for(int n : T.solution(N, M, arr, arr2)) {
			System.out.print(n+" ");
		}
	}
/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i  = 0 ; i<N ; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i  = 0 ; i<M ; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		for(int i : list) {
			System.out.print(i+" ");
		}

	}
*/
}
