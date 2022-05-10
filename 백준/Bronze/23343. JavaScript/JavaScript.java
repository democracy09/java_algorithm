import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String a = st.nextToken();
    String b = st.nextToken();

    try{
      bw.write(String.valueOf(Integer.parseInt(a)-Integer.parseInt(b)));
    }catch(Exception e){
      bw.write("NaN");
    }finally{
      bw.flush();
      bw.close();
      br.close();
    }
  }
}