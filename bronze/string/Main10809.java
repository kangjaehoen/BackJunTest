package bronze.string;

import java.io.*;

public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int[] alpha = new int[26];

        for(int i=0;i<26;i++){
            alpha[i]  = -1;
        }


        for(int i=0;i<s.length();i++){
            int num = s.charAt(i);
            int a = 'a';
            int idx = num-a;

            if(alpha[idx] == -1) {
                alpha[idx] = i;
            }
        }

        for(int alphas : alpha){
            bw.write(alphas+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
