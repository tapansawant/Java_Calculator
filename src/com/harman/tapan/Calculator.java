package com.harman.tapan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1,n2,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        n1 = input.nextInt();

        System.out.println("Enter num2: ");
        n2 = input.nextInt();

        result = n1 + n2;
        System.out.println(result);
    }
}
