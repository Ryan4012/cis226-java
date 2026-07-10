// FileName: EX02_1.java
// Programmer: Ryan Franson

import javax.swing.JOptionPane;

public class EX02_1
{
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        final double r = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
        
        final double a = (PI * (r * r) );

        JOptionPane.showMessageDialog(null, 
        "The area is " + a);

    }
}