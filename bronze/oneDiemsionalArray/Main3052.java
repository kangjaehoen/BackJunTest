package bronze.oneDiemsionalArray;

import java.io.*;

// 생각보다 어려웠음. ㅜㅜ
public class Main3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] checkNum = new int[42];

        for (int i = 0; i < 10; i++) {
            String numStr = bf.readLine();
            int num = Integer.parseInt(numStr);

            int resultNum = num % 42;
            checkNum[resultNum] = 1;
        }

            int count = 0;
            for(int i =0; i<checkNum.length;i++){
                if(checkNum[i] == 1){
                    count++;
                }
            }
            bw.write(String.valueOf(count));

            bw.flush();
            bw.close();
            bf.close();

    }
}
