package silver.twodimensionalarrangement;

import java.io.*;

public class Main2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num =  br.readLine();
        int n = Integer.parseInt(num);

        boolean[][] square = new boolean[100][100];

        for(int i=0;i<n;i++){
           String[] colorPaper =  br.readLine().split("\\s+");
           int x = Integer.parseInt(colorPaper[0]);
           int y = Integer.parseInt(colorPaper[1]);

           for(int j=x;j<x+10;j++){
                for(int z=y;z<y+10;z++){
                    square[j][z] = true;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(square[i][j]){
                    sum++;
                }
            }
        }


        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
