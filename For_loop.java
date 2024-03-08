import java.io.PrintStream;
import java.util.Scanner;

public class For_loop {
    public static void main(String[] arg)
    {
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter the value upto which you want to get natural no : ");
        int a = n.nextInt();
        
        System.out.println("The natural numbers are : ");
        for(int i=1; i<=a; i++)
        {
            System.out.println(i);
        }

    }
    
}
