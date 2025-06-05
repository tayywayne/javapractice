
//20.4 Practice Lab 4
//
//Write a program that takes a full name, age, and salary as inputs on separate lines. Output a formatted message containing the inputs, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//Pat Ford
//35
//        60,000
//
//the output is:
//
//Pat Ford is 35 and makes $60,000.
//

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        String name = scnr.nextLine();
        String age = scnr.nextLine();
        String salary = scnr.nextLine();

        System.out.println(name + " is " + age + " and makes $" + salary + ".");
    }
}