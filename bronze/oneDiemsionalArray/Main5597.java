package bronze.oneDiemsionalArray;

import java.io.*;

public class Main5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[30];
        for(int i=1;i<=28;i++){
           String task =  bf.readLine();
           int taskNum = Integer.parseInt(task);
               students[taskNum-1] = taskNum;
        }

        int[] noSubmit = new int[2];
        int count = 0;
        for(int i=0;i<30;i++){
            if((i+1) != students[i]){
                noSubmit[count] = i+1;
                count++;
            }
        }

        for (Integer taskStudent : noSubmit){
            bw.write(String.valueOf(taskStudent));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
