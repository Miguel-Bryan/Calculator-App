package cm.clear.basic.calc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class MyCalculator {

    public static void main2(String[] args) {
        double num1, num2;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        num1 = console.nextDouble();
        num2 = console.nextDouble();
        System.out.println("Enter de operation sign(+, -, *, /) : ");
        char ops = console.next().charAt(0);
        double o = 0;
        switch (ops) {
            case '+':
                o = num1 + num2;
                break;
            case '-':
                o = num1 - num2;
                break;
            case '*':
                o = num1 * num2;
                break;
            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("Input is Invalid");
        }
System.out.println("The result is : ");
System.out.println(num1+ "" + ops + "" + num2 + "" + "=" + o );
        }
    }


