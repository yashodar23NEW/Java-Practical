package com.mycompany.converting;
     import java.util.Scanner;
     public class Converting {

     public static void main(String[] args) {
        Scanner fc=new Scanner(System.in);
        float f,c;
        System.out.println("Enter the value in fahrenheit");
        f=fc.nextFloat();
        c=(5f/9f)*(f-32);
        System.out.println("the temperature is "+c+"C");
        
        
    }
}
