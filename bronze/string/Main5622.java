package bronze.string;

import java.io.*;


//다이얼 문제.
// 1은 2초 그 이상은 1초씩 더 걸린다.
public class Main5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String[] dial = {"ABC", "DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

        char[] num = new char[str.length()];
        for(int i=0;i<str.length();i++){
            num[i] = str.charAt(i);
        }

        int time =0;
        for(int j=0;j<num.length;j++){
            for(int i=0;i<dial.length;i++){
                if(dial[i].contains(String.valueOf(num[j]))){

                    time += i+1+2;
                }
            }
        }

        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
        br.close();
    }
}
