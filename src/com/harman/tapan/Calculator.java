package com.harman.tapan;

import java.util.Scanner;

public class Calculator {
    public int AddOperation(int x, int y)
    {
        int z = x + y;
        return z;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator(); //Creating Object

        int n1,n2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        n1 = input.nextInt();

        System.out.println("Enter num2: ");
        n2 = input.nextInt();

        result = calc.AddOperation(n1, n2);
        System.out.println(result);
    }
}
