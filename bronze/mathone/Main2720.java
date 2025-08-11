package bronze.mathone;

import java.io.*;

public class Main2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str =  br.readLine();
        int t = Integer.parseInt(str);

        for(int i=0;i<t;i++){
           String changeStr =  br.readLine();
           int change = Integer.parseInt(changeStr);

           int quarter = change / 25;
           int remain1 = change - (quarter*25);

           int dime = remain1/10;
           int remain2 = remain1-(dime*10);

           int nickel = remain2/5;
           int remain3 = remain2-(nickel*5);

           int penny = remain3/1;


           bw.write(quarter+ " "+dime+" "+nickel+" "+penny);
           bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
