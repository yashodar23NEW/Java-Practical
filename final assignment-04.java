package com.mycompany.ifc;

import java.util.Scanner;
public class Ifc {

    public static void main(String[] args) {
         Scanner cs=new Scanner(System.in);
        int num1,num2,num3,sum,product,smallest,largest;
        float avg;
        System.out.println("Enter the first number");
        num1=cs.nextInt();
        System.out.println("Enter the second number");
        num2=cs.nextInt();
        System.out.println("Enter the third number");
        num3=cs.nextInt();
        
        sum=num1+num2+num3;
        product=num1*num2*num3;
        avg=(float)sum/3;
        
        if(num1<=num2 && num1<=num3)
        {
            smallest =num1;
        }
        else if (num2<=num1 && num2<=num3)
        {
          smallest=num2;  
        }
        else
        {
            smallest=num3;
            
         }
        
        if(num1>=num2 && num1>=num2)
        {
            largest=num1;
        }
        else if (num2>=num1 && num2>=num3)
        {
            largest=num2;
        }
                else
        {
            largest=num3;
        }
        
        System.out.println("the sum is "+sum);
        System.out.println("the product is "+product);
        System.out.println("the average is "+avg);
        System.out.println("the smallest number is "+smallest);
        System.out.println("the largest is "+largest);
    }
}
