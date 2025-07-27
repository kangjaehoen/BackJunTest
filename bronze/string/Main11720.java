package bronze.string;

import java.io.*;

public class Main11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr = br.readLine();
        int n = Integer.parseInt(nStr);

        String numStr = br.readLine();


        int plusNum  = 0;
        for(int i=0;i<n;i++){
            char a = numStr.charAt(i);
            int num = Integer.parseInt(String.valueOf(a));
            plusNum += num;
        }


        bw.write(String.valueOf(plusNum));
        bw.flush();
        bw.close();
        br.close();

    }
}
