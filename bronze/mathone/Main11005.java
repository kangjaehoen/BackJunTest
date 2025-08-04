package bronze.mathone;

import java.io.*;
import java.util.Arrays;

public class Main11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("\\s+");

        String nStr = str[0];
        int n = Integer.parseInt(nStr);

        String system = str[1];
        int b = Integer.parseInt(system);

        StringBuilder sb = new StringBuilder();
        while(0<n){
            int num = n%b;
            if(num <10){
                sb.append(num);
            }else {
                sb.append((char) (num - 10 + 'A'));
            }
            n /=b;
        }
        String result = sb.reverse().toString();
       bw.write(result);
       bw.flush();
       bw.close();
       br.close();
    }
}
