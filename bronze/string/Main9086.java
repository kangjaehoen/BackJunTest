package bronze.string;

import java.io.*;
import java.util.ArrayList;

public class Main9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr = br.readLine();
        int n = Integer.parseInt(nStr);

        ArrayList<String> strList = new ArrayList();
        for(int i=0;i<n;i++){
            String num = br.readLine();
            strList.add(num);
        }

        for(String str : strList){
            char firstStr = str.charAt(0);
            char lastStr = str.charAt(str.length()-1);
            bw.write(String.valueOf(firstStr)+lastStr);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
