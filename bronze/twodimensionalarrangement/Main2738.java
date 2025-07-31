package bronze.twodimensionalarrangement;

import java.io.*;

public class Main2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
           String[] strA =  br.readLine().split("\\s+");
           for(int j=0;j<m;j++){
                a[i][j] = Integer.parseInt(strA[j]);
               }
           }

        for (int j=0;j<n;j++){
          String[] strB = br.readLine().split("\\s+");
            for(int i=0;i<m;i++){
                b[j][i] = Integer.parseInt(strB[i]);
            }
        }

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
               bw.write(a[x][y]+b[x][y]+" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
