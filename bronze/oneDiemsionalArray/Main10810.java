package bronze.oneDiemsionalArray;

import java.io.*;

// n번까지 바구니 개수를 가지고 있음.
// n번까지의 공을 매우 많이 가지고 있음.
// 가장 처음 바구니에는 공이 없다.
// 바구니에는 공을 하나만 가져야한다.
// i, j , k  => i번 바구니 부터 j번 바구니까지 k번 공은 넣음.
// 1 ≤ i ≤ j ≤ N
// 1 ≤ k ≤ N
public class Main10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm =  bf.readLine().split(" ");

        // 바구니 개수 1~100
        int n = Integer.parseInt(nm[0]);

        // 공 넣는 횟수. 1~100
        int m = Integer.parseInt(nm[1]);


        // 바구니에 공을 담아주자.
        int[] basket = new int[n];

        for(int z=0;z<m;z++){
            String[] strNum = bf.readLine().split(" ");
            int i = Integer.parseInt(strNum[0]) - 1;
            int j = Integer.parseInt(strNum[1]) - 1;
            int k = Integer.parseInt(strNum[2]);

            for(int y=i;y<=j;y++){
                basket[y] = k;
            }
        }

        for(int i = 0;i<n;i++){
            bw.write(basket[i]+" ");
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
