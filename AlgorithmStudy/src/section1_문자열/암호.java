package section1_문자열;
import java.io.*;
public class 암호 {
   public String solution(int N, String str) {
      String answer = "";
      String[] input = new String[N];
      for(int i = 0; i<N ; i++) {
         input[i] = str.substring(i*7, i*7+7);
         input[i] = input[i].replaceAll("#", "1");
         input[i] = input[i].replaceAll("\\*", "0");
      }
      for(int i = 0; i<N ; i++) {
         String s = input[i];
         int sum = 0;
         int count = 0;
         for(int j = s.length()-1; j>=0 ; j--) {
            
            if(s.charAt(j)=='1') {
               sum+=Math.pow(2, count);
            }
            count++;
         }
         answer+=(char)sum;
      }
      return answer;
   }
   public String solution2(int N, String str) {
      String answer = "";
      String[] input = new String[N];
      for(int i = 0; i<N ; i++) {
         input[i] = str.substring(i*7, i*7+7).replace('*', '0').replace('#','1');
         int num = Integer.parseInt(input[i],2); // 2진수 계산하여 정수로 나타냄
         answer += (char)num;
      }
      return answer;
   }
   public static void main(String[] args) throws IOException {
      암호 T = new 암호();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      String str = br.readLine();
      System.out.println(T.solution2(N,str));
   }

}