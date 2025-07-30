package silver.deepen;

import java.io.*;

public class Main1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr = br.readLine();
        int n = Integer.parseInt(nStr);
        int count =0;

        for(int i=0;i<n;i++){
           String t =  br.readLine();

            char beforeString = 0;
            int[] alpha = new int[26];

            int aASCII = 'a';
            boolean check  = true;


            // happy
            // a -> h 같을 경우와 다를 경우
            // 같은 경우는 기록만 해두고.
            // 다를 경우는 다를 경우는
           for(int j=0;j<t.length();j++){
               char nowString = t.charAt(j);
               int nowASCII = nowString;


               if(nowString != beforeString){
                    if(alpha[nowASCII-aASCII] != 0) {
                        check = false;
                        break;
                    }
                   alpha[nowASCII-aASCII] = 1;
               }
               beforeString = nowString;
           }
           if(check == true){
               count ++;
           }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
