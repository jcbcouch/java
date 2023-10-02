import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myScanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input



        System.out.println("Enter name, age and salary:");
        String name = myScanner.nextLine();
        int age = myScanner.nextInt();
        double salary = myScanner.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}



//nextBoolean() Reads a boolean value from the user
//nextByte() 	Reads a byte value from the user
//nextDouble() 	Reads a double value from the user
//nextFloat() 	Reads a float value from the user
//nextInt() 	Reads a int value from the user
//nextLine() 	Reads a String value from the user
//nextLong() 	Reads a long value from the user
//nextShort() 	Reads a short value from the user