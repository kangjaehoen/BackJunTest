package bronze.string;

import java.io.*;

public class Main2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new
                BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int s = Integer.parseInt(str);


        for(int i=0;i<s;i++){
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            String m = nm[1];

           for(int j=0;j<m.length();j++){
            for(int x=0;x<n;x++){
                bw.write(m.charAt(j));
            }
           }
           bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
