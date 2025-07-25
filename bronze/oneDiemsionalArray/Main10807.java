package bronze.oneDiemsionalArray;// 백준 10807번, 개수 세긴

import java.io.*;

public class Main10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str =  bf.readLine();
        int n = Integer.parseInt(str);
        int[] arr = new int[n];

        String strNum = bf.readLine();
        String[] num = strNum.split(" ");
        for(int i=0;i<n;i++){
         arr[i] = Integer.parseInt(num[i]);
        }

        String findStr = bf.readLine();
        int findNum = Integer.parseInt(findStr);

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == findNum){
                count +=1;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        bf.close();
    }
}
