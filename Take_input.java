import java.util.Scanner;

public class Take_input
{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);                            // To take inputs.

        System.out.println("Enter the integer you want to show : ");
        int a = i.nextInt();                                                // Reads int values.
        System.out.print("You entered : ");
        System.out.println(a);

        System.out.println("Enter the float value you want to show : ");
        float b = i.nextFloat();                                            // Reads float values.
        System.out.print("You entered : ");
        System.out.println(b);

        System.out.println("Enter the string value you want to show : ");
        String c = i.next();                                                // Reads only one word.
        System.out.print("You entered : ");
        System.out.println(c);
    }
}