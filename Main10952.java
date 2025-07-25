import java.io.*;

public class Main10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean check = true;

        int max = 0;
        while (check){
            String ab = bf.readLine();
            String[] arrays = ab.split(" ");
            int a = Integer.parseInt(arrays[0]);
            int b = Integer.parseInt(arrays[1]);
            if(a == 0 && b==0){
                check = false;
                break;
            }
            max = a+b;
            bw.write(String.valueOf(max));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();

    }
}
