package bronze.oneDiemsionalArray;

import java.io.*;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr = br.readLine();
        int n = Integer.parseInt(nStr);

        int[] arr = new int[n];

        String[] gradeStr = br.readLine().split(" ");

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(gradeStr[i]);
        }

        int max = arr[0];
        for(int j=0;j<arr.length;j++){
            if(max <arr[j]){
                max = arr[j];
            }
        }

        Double[] grades = new Double[n];
        for(int x=0;x<arr.length;x++){
            grades[x] = ((double) arr[x]/max)*100;
        }


        double avg = 0;
        for(int z=0;z<grades.length;z++){
            avg += grades[z];
        }
        double result = avg/n;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}

