/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author MP3_027
 */
public class lab4q3 {

    public static void main(String[] args) {
        int currentYear = 2024;

        //000202-01-0000
        String inputdata = JOptionPane.showInputDialog("Enter the your ic");
        String yearPart = inputdata.substring(0, 2);
        String monthPart = inputdata.substring(2, 4);
        String dayPart = inputdata.substring(4, 6);

        int birthyear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);

        birthyear = birthyear + 2000;
        //calculation
        int age = currentYear - birthyear;

        String message = String.format("Birth date %d-%d-%d", day, month, birthyear) + String.format("\nAge %d", age);

        JOptionPane.showMessageDialog(null, message);

    }
}
