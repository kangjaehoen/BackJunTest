package bronze.string;

import java.io.*;

public class Main1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().trim();
        int num = 0;
        if(!str.isEmpty()) {
            String[] strArr = str.split(" ");
             num = strArr.length;

        }
        bw.write(String.valueOf(num));

        bw.flush();
        bw.close();
        br.close();

    }
}
