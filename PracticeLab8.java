//
//
//Write a program that creates an array to hold three values of type double. The program should collect the three double values as input and store them in the array. Then calculate the average value of the array.
//
//Output the array values and calculated average value, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//        10.0
//        10.5
//        11.0
//
//the output is:
//
//Array items: 10.0, 10.5, 11.0
//Average: 10.5



import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        double[] values = new double[3];
        values[0] = scnr.nextDouble();
        values[1] = scnr.nextDouble();
        values[2] = scnr.nextDouble();
        double ave = (values[0] + values[1] + values[2]) / 3;
        System.out.println("Array items: " + values[0] ", " + values[1] + ", " + values[2]);
        System.out.println("Average: " + ave);
    }
}