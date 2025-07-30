package bronze.deepen;

import java.io.*;

public class Main1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String upperStr =  str.toUpperCase();

        String a = "A";
        int num = a.charAt(0);
        int[] alpha = new int[26];

        for(int i=0;i<alpha.length;i++){
            alpha[i] = 0;
        }

        for(int j=0;j<str.length();j++){
            int asciiNum = upperStr.charAt(j);
            int checkNum =  asciiNum-num;

            for(int y=0;y<alpha.length;y++){
                if(checkNum == y){
                    int alphaNum = alpha[y];
                    alpha[y] = alphaNum+1;
                }
            }
        }

        int max = alpha[0];
        int maxNum = 0;
        for(int x=0;x<alpha.length;x++){
            if(max<alpha[x]){
                max = alpha[x];
                maxNum = x;
            }
        }

        int countSame = 0;
        for(int n=0;n<alpha.length;n++){
            if(max == alpha[n]){
                countSame++;
            }
        }
        int resultNum = maxNum+num;
        char result = (char) resultNum;


        if(countSame >1){
            bw.write("?");
        }else {
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
