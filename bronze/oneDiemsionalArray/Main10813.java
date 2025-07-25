package bronze.oneDiemsionalArray;
// 백준 10813번 문제.

import java.io.*;

public class Main10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm =bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] bag = new int[n];

        for(int x=0;x<n;x++){
            bag[x] = x+1;
        }

        for(int y=0;y<m;y++){
          String[] ij = bf.readLine().split(" ");
          int i = Integer.parseInt(ij[0])-1;
          int j = Integer.parseInt(ij[1])-1;

          int fb = bag[i];
          int sb = bag[j];

          bag[i] = sb;
          bag[j] = fb;
        }

        for(Integer bags : bag){
            bw.write(bags+" ");
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
