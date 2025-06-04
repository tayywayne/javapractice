//
//20.10 Practice Lab 10
//
//An existing class Customer() has been provided in Customer.java. Write a program in main() of CustomerAge.java to accept one string input and one integer input for a customer's name and age fields, respectively. Use the existing customer1 and customer2 reference variables provided in the template to set the name and age of both customer objects using the setName() and setAge() methods. Determine which customer is older using its getAge() method.
//
//Output the older customer's information using its printInfo() method, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
//
//If the input is:
//
//Jane
//25
//John
//29
//
//the output is:
//
//Customer that is older:
//Name: John
//Age: 29
//



import java.util.Scanner;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();


        // TODO: Declare name and age variables (string, and int)
        String c1name = scnr.nextLine();
        int c1age = Integer.parseInt(scnr.nextLine());
        String c2name = scnr.nextLine();
        int c2age = Integer.parseInt(scnr.nextLine());

        customer1.setName(c1name);
        customer1.setAge(c1age);
        customer2.setName(c2name);
        customer2.setAge(c2age);

        System.out.println("Customer that is older:");

        if(customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }

    }
}