package silver.deepen;

import java.io.*;

public class Main1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int n = Integer.parseInt(num);
        int count = 0;

        for(int i=0;i<n;i++){
            String str =  br.readLine();
            int[] alpha = new int[26];


            int aAscII = 'a';
            char before = 0;
            boolean check = true;


            for(int j=0;j<str.length();j++){
                char now =  str.charAt(j);
                int cAscII = now;
                int idx = cAscII-aAscII;

               if(now!=before){
                    if(alpha[idx] != 0){
                        check = false;
                        break;
                    }

                   alpha[idx] =1;
               }
                before = now;
            }
            if(check){
                count ++;
            }
        }
        System.out.println(count);

    }
}
