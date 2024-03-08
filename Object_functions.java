import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Object_functions {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Object_functions obj = new Object_functions();

        System.out.print("Enter the first integer : ");
        int a = n.nextInt();

        System.out.print("Enter the second integer : ");
        int b = n.nextInt();

        System.out.println();

// Here we add first and second integers
        int c = obj.add(a, b);
        System.out.println("Sum of above integers is : " + c);
        System.out.println();


// Here we substract smaller integer from greater integer
        int d = obj.sub(b, a);
        System.out.println("Substract smaller from greater integer is  : " + d);
        System.out.println();

// Here we multiply first and second integers
        int e = obj.mul(a, b);
        System.out.println("Product of above integers is : " + e);
        System.out.println();

    }


    // Funtion to add integers
    public int add(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }

    // Function to substract integers
    public int sub(int num1, int num2)
    {
        int result;

        if(num1>num2)
        {
            result = num1 - num2;
        }
        else if(num2<num1)
        {
            result = num2 - num1;
        }
        else
        {
            result=0;
        }
        return result;
    }

    // Funtion to multiply integers
    public int mul(int num1, int num2)
    {
        int result = num1 * num2;
        return result;
    }    
}
