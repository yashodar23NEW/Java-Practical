package com.mycompany.mavcalproduct;

     import java.util.Scanner;
      public class MavCalproduct {

    public static void main(String[] args) {
        Scanner cp= new Scanner(System.in);
        
        int no1,no2,no3,product;
        System.out.println("Enter the first number");
        no1=cp.nextInt();
        System.out.println("Enter the second number");
        no2=cp.nextInt();
        System.out.println("Enter the third number");
        no3=cp.nextInt();
        product=no1*no2*no3;
        System.out.println("The product is "+total);
    }
}
