package bronze.oneDiemsionalArray;
// 백분 10818 문제

import java.io.*;
import java.util.Arrays;

public class Main10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nNum = bf.readLine();
        int n = Integer.parseInt(nNum);

        String[] num = bf.readLine().split(" ");
        int[] numArr = new int[n];

        for(int i=0;i<n;i++){
            numArr[i]=Integer.parseInt(num[i]);
        }
        Arrays.sort(numArr);
        bw.write(String.valueOf(numArr[0])+ " ");
        bw.write(String.valueOf(numArr[n-1]));

        bw.flush();
        bw.close();
        bf.close();

    }
}
