package bronze.twodimensionalarrangement;

import java.io.*;

public class Main2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] twoArr = new int[9][9];
        for(int i=0;i<9;i++){
            String[] str =  br.readLine().split("\\s+");
            for(int j=0;j<9;j++){
                int num = Integer.parseInt(str[j]);
                twoArr[i][j] = num;
            }
        }
        int max = twoArr[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for(int j=0;j<9;j++){
            for(int x=0;x<9;x++){
             if(max < twoArr[j][x]){
                 max = twoArr[j][x];
                 maxRow = j;
                 maxColumn =x;
             }
            }
        }
        int row = maxRow+1;
        int column = maxColumn+1;
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(row+" "+column);

        bw.flush();
        bw.close();
        br.close();
    }

}
