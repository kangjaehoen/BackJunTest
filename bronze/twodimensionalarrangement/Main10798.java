package bronze.twodimensionalarrangement;

import java.io.*;

public class Main10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] arr = new String[5][15];

        StringBuilder builder =  new StringBuilder();

        for(int i=0;i<5;i++){
           String str = br.readLine();
            for(int j =0;j<str.length();j++){
                arr[i][j] = String.valueOf(str.charAt(j));

            }
        }

        for(int j=0;j<15;j++){
            for(int x=0;x<5;x++){
                if(arr[x][j] != null) {
                    builder.append(arr[x][j]);
                }
            }
        }

        bw.write(String.valueOf(builder));
        bw.flush();
        bw.close();
        br.close();
    }
}
