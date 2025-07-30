package bronze.deepen;

import java.io.*;

public class Main2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr =  br.readLine();
        int n = Integer.parseInt(nStr);
        int t = n*2-1;

        for(int i=1;i<=t;i++){
           if(i<=n){
               for(int j=n-i;j>0;j--){
                       bw.write(" ");
               }
               for(int x=0;x<i*2-1;x++){
                   bw.write("*");
               }
               bw.newLine();
           }else {
                for(int y=0;y<i-n;y++){
                    bw.write(" ");
                }
                for(int z=(t-i)*2+1;z>0;z--){
                    bw.write("*");
                }

                bw.newLine();
           }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
