package bronze.string;

import java.io.*;

public class Main2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String alpha = br.readLine();

        int num = alpha.length();

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
