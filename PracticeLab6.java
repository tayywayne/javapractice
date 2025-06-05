//
//20.6 Practice Lab 6
//
//Write a program that collects a full name as one string input.
//
//Format and output the name as shown below:
//
//lastInitial., firstName middleInitial.
//
//If no middle name was provided, format and output the name as shown below:
//
//lastInitial., firstName
//
//If the input is:
//
//Pat Silly Doe
//
//the output is:
//
//D., Pat S.
//
//Alternatively, if the input is:
//
//Julia Clark
//
//the output is:
//
//C., Julia
//

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        String[] name = scnr.nextLine().split(" ");
        if(name.length() = 2) {
            System.out.println(name[1].charAt(0) + "., " + name[0]);
        } else {
            System.out.println(name[2].charAt(0) + "., " + name[0] + " " + name[1].charAt(0) + ".");
        }

    }
}
