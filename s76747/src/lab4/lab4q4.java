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
public class lab4q4 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter text ");

        StringBuilder toggledText = new StringBuilder();
        for (int x = 0; x < input.length(); x++) {
            char c = input.charAt(x);

            if (Character.isLowerCase(c)) {
                toggledText.append(Character.toUpperCase(c));

            } else if (Character.isUpperCase(c)) {
                toggledText.append(Character.toLowerCase(c));
            } else {
                toggledText.append(c);

            }
        }
        String message = String.format("Original text: %s\nFormatted text: %s", input, toggledText.toString());
        JOptionPane.showMessageDialog(null, message);

    }
}
