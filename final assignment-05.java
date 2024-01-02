package com.mycompany.calavg;
import java.util.Scanner;

public class CalAvg {

    public static void main(String[] args) {
        Scanner c1=new Scanner(System.in);
        int[] no=new int[20];
        int i=0;
        int total=0;
        float average;
        
        while(i<20)
        {
            System.out.println("enter the number");
            no[i]=c1.nextInt();
            
            if(no[i]==-1)
            {
                break;
            }
            else
            {
                total=total+no[i];
                i++;
            }
                    
        }
        average=(float)total/20;
        System.out.println("the total is"+total);
        System.out.println("the average is "+String.format("%.2f", average));
        
            
            
        
    }
}

