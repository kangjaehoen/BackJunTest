package bronze.sort;

import java.io.*;
import java.util.Arrays;

public class Main2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n  = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
           int num =  Integer.parseInt(br.readLine());
            arr[i] = num;
        }


        Arrays.sort(arr);
        for(int arrASC : arr){
            bw.write(String.valueOf(arrASC));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
