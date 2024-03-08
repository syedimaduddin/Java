import java.util.Scanner;

public class Array {
    public static void main(String[] arg)
    {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the range of array : ");
        int a = n.nextInt();

        int[] b = new int[a];        
        System.out.println("Enter the values in array : ");
        for(int i=0; i<a; i++)
        {
            b[i] = n.nextInt();
        }
        System.out.print("Your entered array is : ");
        for(int i=0; i<a; i++)
        {
            System.out.print(b[i]);
            System.out.print(", ");
        }
        System.out.println();

    }
    
}
