package com.hackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecisionPrinting {
	public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000000");//Precision till 6 decimal places including rounding too
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the n");
        int n = in.nextInt();
        int arr[] = new int[n];
        float positiveCount=0;
        float negativeCount=0;
        float    zeroCount=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                positiveCount++;
            if(arr[arr_i]<0)
                negativeCount++;
            if(arr[arr_i]==0)
                zeroCount++;           
            
        }
        float sum=positiveCount+negativeCount+zeroCount;       
        System.out.println(df.format(positiveCount/sum ));
        System.out.println(df.format(negativeCount/sum ));
        System.out.println(df.format(zeroCount/sum ));
    }

}
