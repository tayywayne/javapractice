//
//20.5 Practice Lab 5
//
//A number is divisible by 3 if the sum of its digits is divisible by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 and 9 is divisible by 3.
//
//Write a program that collects three integer inputs representing the place values of a three-digit number. Determines whether the sum of the digits is divisible by 3. If any integer entered is a negative value, output Invalid input!
//
//Output a formatted message identifying if the three-digit number is divisible by 3, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//1
//5
//3
//
//the output is:
//
//153 is divisible by 3!
//
//Alternatively, if the input is:
//
//1
//0
//4
//
//the output is:
//
//104 is not divisible by 3!
//
//Alternatively, if the input is:
//
//1
//-5
//3
//
//the output is:
//
//Invalid input!
//

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        String num1 = scnr.nextLine();
        String num2 = scnr.nextLine();
        String num3 = scnr.nextLine();
        String number = num1 + num2 + num3;

        if(Integer.parseInt(num1) < 0 || Integer.parseInt(num2) < 0 || Integer.parseInt(num3) < 0) {
            Sytem.out.println("Invalid input!");
        } else if (Integer.parseInt(number) % 3 == 0) {
            System.out.println(number + " is divisible by 3!");
        } else {
            System.out.println(number + " is not divisible by 3!");
        }

}