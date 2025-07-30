package bronze.deepen;

import java.io.*;

public class Main10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringBuilder sbStr = new StringBuilder(str);

        String reverseStr = sbStr.reverse().toString();

        if(str.equals(reverseStr)){
            bw.write(String.valueOf(1));
        }else {
            bw.write(String.valueOf(0));
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
