package silver.deepen;

import java.io.*;

public class Main2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        int count = 0;
        String str = br.readLine();
        for(String c :cro){
            str = str.replace(c,"@");
            
        }

        int num = str.length();
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}
