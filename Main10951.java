import java.io.*;

public class Main10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;
        while ((str = br.readLine()) != null && !str.isEmpty()){

         String[] arr = str.split(" ");

         int a = Integer.parseInt(arr[0]);
         int b = Integer.parseInt(arr[1]);
         int max = a+b;
         bw.write(String.valueOf(max));
         bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
