/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class lab4q6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double num_Ofvalues = 3.0;
        System.out.print("Enter the first value : ");
        int x1 = input.nextInt();
        
        System.out.print("Enter the second value : ");
        int x2 = input.nextInt();
        
        System.out.print("Enter the third value : ");
        int x3 = input.nextInt();
        
        //Calculation
        
        double mean = (x1 + x2 + x3) / num_Ofvalues ;
        double variance = (((Math.pow(x1 - mean, 2)) + (Math.pow(x2 - mean, 2))+ (Math.pow(x3 - mean, 2) )))/num_Ofvalues;
        double deviation = Math.sqrt(variance);
        
        System.out.printf("Mean of three values : %.2f", mean);
        System.out.printf("\nVariance of three values : %.2f", variance);
        System.out.printf("\nDeviation of three values : %.2f", deviation);
        System.out.println("");
        
    }
}
