import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int max = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    int sum=0, tmp=0;
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    for(int i=0;i<n-2;i++){
      for(int j=i+1;j<n-1;j++){
        for(int k=j+1;k<n;k++){
          tmp = arr[i] + arr[j] + arr[k];
          if(tmp == max){
            System.out.println(tmp);
            System.exit(0);
          }
          if(sum < tmp && tmp < max){
            sum = tmp;
          }
        }
      }
    }
    System.out.println(sum );
  }
}