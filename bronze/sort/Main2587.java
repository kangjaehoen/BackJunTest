package bronze.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        String str;
        while((str = br.readLine()) !=null && br.readLine().isEmpty()) {
            list.add(Integer.parseInt(str));
        }

        int sum =0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        int avg = sum/list.size();

        bw.write(String.valueOf(avg));

        bw.flush();
        bw.close();
        br.close();

    }
}
