package bronze.string;

import java.io.*;

public class Main2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ab= br.readLine().split(" ");

        String a  = ab[0];
        String b = ab[1];

        String aRevers = new StringBuilder(a).reverse().toString();
        String bRevers = new StringBuilder(b).reverse().toString();

        int aNum = Integer.parseInt(aRevers);
        int bNum = Integer.parseInt(bRevers);

        if(aNum > bNum){
            bw.write(aRevers);
        }else {
            bw.write(bRevers);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
