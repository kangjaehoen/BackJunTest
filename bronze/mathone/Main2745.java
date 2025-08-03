package bronze.mathone;

import java.io.*;

public class Main2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str =  br.readLine().split("\\s+");
        String nStr = str[0];
        String bStr = str[1];
        int b = Integer.parseInt(bStr);
        int n = 0;
        int sum = 0;


        for(int i=0;i< nStr.length();i++){
           char nChar = nStr.charAt(i);
           if(Character.isDigit(nChar)){
               n= nChar - '0';
           }else {
               n = nChar - 'A' + 10;
           }


           int multi =  1;

            for(int j = nStr.length()-(i+1);0<j;j--){
                multi *= b;
            }
            sum += n*multi;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
