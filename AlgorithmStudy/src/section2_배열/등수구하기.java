package section2_배열;
import java.util.*;
import java.io.*;
public class 등수구하기 {
	public List<Integer> solution(int N, int[] score){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < N ; i ++) {
			int rank=1;
		 	for(int j = 0 ; j < N ; j++ ) {
		 		if(score[i]<score[j])
		 			rank++;
		 	}
		 	list.add(rank);
		}
		return list;
	}
	public static void main(String[] args) throws IOException {
		등수구하기 T = new 등수구하기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] score = new int[N];
		for(int i  = 0 ; i < N ; i ++) {
			score[i]= Integer.parseInt(st.nextToken());
		}
		for(int rank : T.solution(N, score)) {
			System.out.print(rank+" ");
		}
		
	}

}
