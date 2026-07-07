// FileName: EX01_2.java
// Programmer: Ryan Franson

import java.util.Scanner;

public class EX01_2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        int sum = n1 + n2 + n3;

        System.out.println("Sum: " + sum);

        input.close();

    }

}