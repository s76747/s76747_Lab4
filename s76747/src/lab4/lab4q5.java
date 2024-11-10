/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class lab4q5 {

    public static void main(String[] args) {

        final int mile_toMtr = 1609;
        final int kilo_toMtr = 1000;

        final int min_toSec = 60;
        final double hour_toSec = 3600.0;
        final double hour_toMin = 60.0;

        String input_distance = JOptionPane.showInputDialog("Enter distance in meter : ");
        double distance = Double.parseDouble(input_distance);

        String input_hour = JOptionPane.showInputDialog("Enter hours :  ");
        int hour = Integer.parseInt(input_hour);

        String input_min = JOptionPane.showInputDialog("Enter minutes :  ");
        int min = Integer.parseInt(input_min);

        String input_sec = JOptionPane.showInputDialog("Enter seconds :  ");
        int sec = Integer.parseInt(input_sec);

        //calculate time
        int total_sec = (int) (hour * hour_toSec) + (min * min_toSec) + sec; //hour, min to seconds
        double total_hour = hour + (min / hour_toMin) + (sec / hour_toSec); //min, sec to hour

        //calculate distance
        double km = distance / kilo_toMtr;
        double mile = distance / mile_toMtr;

        //calculate speed
        double speed_ms = distance / total_sec;
        double speed_kmh = km / total_hour;
        double speed_mile = mile / total_hour;

        //display
        String message = String.format("Meter per second: %.2f", speed_ms) + String.format("\nKilometer per hour: %.2f", speed_kmh) + String.format("\nMiles per hour: %.2f", speed_mile);

        JOptionPane.showMessageDialog(null, message);
    }
}
