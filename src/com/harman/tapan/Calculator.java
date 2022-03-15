package com.harman.tapan;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Addition adcalc = new Addition(); //Creating Object
        Subtraction subcalc = new Subtraction();
        Multiplication multc  = new Multiplication();
        Division divcalc = new Division();

        int n1,n2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        n1 = input.nextInt();

        System.out.println("Enter num2: ");
        n2 = input.nextInt();

        int result1 = adcalc.AddOperation(n1, n2);
        int result2 = subcalc.SubOperation(n1, n2);
        int result3 = multc.MultOperation(n1, n2);
        int result4 = divcalc.DivOperation(n1, n2);

        System.out.println("Addition is : "+ result1);
        System.out.println("Subtraction is: "+ result2);
        System.out.println("multuplication is : "+ result3);
        System.out.println("Division is : "+ result4);
    }
}
