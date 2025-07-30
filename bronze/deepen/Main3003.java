package bronze.deepen;

import java.io.*;

public class Main3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] pieceArr = br.readLine().split(" ");
        int[] pieceNum = {1,1,2,2,2,8};
        int[] totalNum = new int[pieceArr.length];

        for(int i=0;i<pieceArr.length;i++){
            totalNum[i] = pieceNum[i] - Integer.parseInt(pieceArr[i]);
            bw.write(totalNum[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
