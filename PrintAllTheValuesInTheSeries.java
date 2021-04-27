package com.company;
import java.math.*;
import java.util.Scanner;
import java.io.*;
public class PrintAllTheValuesInTheSeries {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int intermediatteProduct=0;
            for(int j=0;j<=n-1;j++)
            {
                int power = (int) Math.pow(2,j);
                intermediatteProduct= intermediatteProduct+power;
                System.out.print(a+b*intermediatteProduct + " ");
            }
            System.out.println('\n');

        }
        in.close();
    }
}
