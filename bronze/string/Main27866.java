package bronze.string;

import java.io.*;

public class Main27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String iStr = br.readLine();

        int i = Integer.parseInt(iStr);

        char iFindStr =  s.charAt(i-1);

        bw.write(String.valueOf(iFindStr));

        bw.flush();
        bw.close();
        br.close();
    }
}
