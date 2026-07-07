// FileName: EX01_1.java
// Programmer: Ryan Franson

import javax.swing.JOptionPane;

public class EX01_1
{
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter your full name: ");
        JOptionPane.showMessageDialog(null,
         n1 + " is learning Java Programming!", null,
        JOptionPane.PLAIN_MESSAGE);


    }
}
