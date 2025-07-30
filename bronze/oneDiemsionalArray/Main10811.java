package bronze.oneDiemsionalArray;

import java.io.*;

public class Main10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n  = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] bag = new int[n];

        for(int x=0;x<n;x++){
            bag[x] = x+1;
        }

        for(int y=0;y<m;y++){
           String[] ij =  br.readLine().split(" ");
           int i = Integer.parseInt(ij[0])-1;
           int j = Integer.parseInt(ij[1])-1;

          while (i<j){
              int a = bag[i];
              int b = bag[j];
              bag[i] = b;
              bag[j] = a;
              i++;
              j--;
          }
        }
        for(Integer bags : bag){
            bw.write(bags+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
