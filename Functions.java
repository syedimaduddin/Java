import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        // Now we print a line using function.
        hello();

        // First we add two integers.
        System.out.println("Enter first no : ");
        int a = n.nextInt();
        System.out.println("Enter second no : ");
        int b = n.nextInt();
        add(a, b);  
    }

    // Function to add two integers.
    public static void add(int num1, int num2)
    {
        System.out.println("Sum of above integers is : "+ (num1+num2));
    }

    // Function to print a line
    public static void hello()
    {
        System.out.println("In this program we add two integers.");
    }
    
}
