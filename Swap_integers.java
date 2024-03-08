import java.util.Scanner;

public class Swap_integers {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
    
        System.out.print("Enter the first no : ");
        int a = n.nextInt();

        System.out.print("Enter the second no : ");
        int b = n.nextInt();

        // here we swapping function
        Swap_function(a, b);
    }

    // Funtion to swap values
    public static void Swap_function(int num1, int num2)
    {
        System.out.println();
        System.out.println("Before swapping : a = "+num1+" & b = "+num2);
        int k;
        k=num1;
        num1 = num2;
        num2 = k;

        System.out.println();
        System.out.println("After swapping : a = "+num1+" & b = "+num2);
        System.out.println();
    }
    
}
