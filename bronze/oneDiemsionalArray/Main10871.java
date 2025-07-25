package bronze.oneDiemsionalArray;

import java.io.*;

public class Main10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nxStr = bf.readLine();
        String[] nx = nxStr.split(" ");

        String aStr = bf.readLine();
        String[] a = aStr.split(" ");

        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);

        int[] aArray = new int[n];

        for(int i=0;i<n;i++){
            aArray[i] = Integer.parseInt(a[i]);
            if(aArray[i] < x){
                bw.write(String.valueOf(aArray[i])+" ");
            }
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
