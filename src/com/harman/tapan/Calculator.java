package com.harman.tapan;

import java.util.Scanner;

public class Calculator extends ParentCalculator{

    public static void main(String[] args) {
       Calculator obj = new Calculator();

        int n1,n2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        n1 = input.nextInt();

        System.out.println("Enter num2: ");
        n2 = input.nextInt();

        int result1 = obj.AddOperation(n1, n2);
        int result2 = obj.SubOperation(n1, n2);
        int result3 = obj.MultOperation(n1, n2);
        int result4 = obj.DivOperation(n1, n2);

        System.out.println("Addition is : "+ result1);
        System.out.println("Subtraction is: "+ result2);
        System.out.println("multuplication is : "+ result3);
        System.out.println("Division is : "+ result4);
    }
}
