package bronze.mathone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2903 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int point = (int) Math.pow(2, n) + 1;
        int result = point * point;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
