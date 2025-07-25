package bronze.oneDiemsionalArray;

import java.io.*;

public class Main2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];

        for(int i=0;i<9;i++){
           arr[i] =Integer.parseInt(bf.readLine());
        }

        int max = arr[0];
        for(int j=0;j<9;j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        bw.write(String.valueOf(max));
        bw.newLine();

        for(int z=0;z<9;z++){
            if(arr[z] == max){
                bw.write(String.valueOf(z+1));
            }
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
