/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author MP3_027
 */
public class l4q1 {

    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);

        System.out.println("Enter first digit : ");
        int num1 = inputdata.nextInt();

        System.out.println("Enter second digit : ");
        int num2 = inputdata.nextInt();

        //calculation
        int square1 = num1 * num1;
        int square2 = num2 * num2;

        //sum
        int sumSquare = num1 + num2;
        //diferences
        int diffSquare = num1 - num2;

        System.out.println(" The square of " + num1 + " is " + square1);
        System.out.println(" The square of " + num2 + " is " + square2);
        System.out.println(" The sum of both squared number = " + sumSquare);
        System.out.println(" The differences of both squared number = " + diffSquare);
    }
}
