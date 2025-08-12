package bronze.mathone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2903 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr = br.readLine();
        int n =Integer.parseInt(nStr);

        int m =1;
        for(int i=0;i<n;i++){
            m *=2;
        }
        int max = m+1;
        int result = max*max;



        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
