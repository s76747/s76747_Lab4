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
public class lab4q2 {

    public static void main(String[] args) {
        String inputdata = JOptionPane.showInputDialog("Enter the radius");
        double radius = Double.parseDouble(inputdata);

        final double pi = 3.14159;

        //calculate
        double diameter = 2 * radius;
        double circumference = 2 * pi * radius;
        double area = pi * (radius * radius);

        String message = String.format("Radius %.2f", radius) + String.format("\nDiameter %.2f", diameter) + String.format("\nCircumference %.2f", circumference) + String.format("\nArea %.2f", area);
        JOptionPane.showMessageDialog(null, message);

    }
}
