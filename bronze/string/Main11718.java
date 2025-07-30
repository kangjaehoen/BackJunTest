package bronze.string;

import java.io.*;

public class Main11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int count = 0;

        while((str= br.readLine()) != null && count<100){
            bw.write(str);
            bw.newLine();
            count++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
