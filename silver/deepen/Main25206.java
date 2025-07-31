package silver.deepen;

import java.io.*;

public class Main25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] credit = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
        double[] creditNum = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};
        double totalGrade= 0;
        double totalCredit = 0;


        for(int i=0;i<20;i++){
               String[] str=  br.readLine().split(" ");
               String grade =  str[1];
               String creditStudent = str[2];

               double gradeNum = Double.parseDouble(grade);

               if(!creditStudent.equals("P")){
                   for(int j=0;j<credit.length;j++){
                       if(credit[j].equals(creditStudent)){
                           totalGrade +=  gradeNum * creditNum[j];
                           totalCredit +=gradeNum;
                       }
                   }
               }
        }
        double gradeAvg = totalGrade/totalCredit;
        bw.write(String.format("%.6f",gradeAvg));
        bw.flush();
        bw.close();
        br.close();
    }
}
