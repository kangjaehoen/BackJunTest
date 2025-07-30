package bronze.string;

import java.io.*;

public class Main11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       String str =  br.readLine();

       int n = str.charAt(0);
       bw.write(String.valueOf(n));
       bw.flush();
       bw.close();
       br.close();

    }
}
