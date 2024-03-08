import java.util.Scanner;

public class Add_arrays {
    public static void main(String[] arg)
    {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter the order of arrays : ");
        int a = n.nextInt();

        System.out.println("Enter the values of first array : ");
        int[] first = new int[a];
        for(int i=0; i<a; i++)
        {
            first[i] = n.nextInt();
        }

        System.out.println("Enter the values of first array : ");
        int[] second = new int[a];
        for(int i=0; i<a; i++)
        {
            second[i] = n.nextInt();
        }

        System.out.print("Your entered first array is : ");
        for(int i=0; i<a; i++)
        {
            System.out.print(first[i]);
            System.out.print(", ");
        }
        System.out.println();

        System.out.print("Your entered second array is : ");
        for(int i=0; i<a; i++)
        {
            System.out.print(second[i]);
            System.out.print(", ");
        }
        System.out.println();

        int[] third = new int[a];

        for(int i=0; i<a; i++)
        {
            third[i] = first[i] + second[i]; 
        }

        System.out.print("The resultant array after add first and second arrays is : ");
        for(int i=0; i<a; i++)
        {
            System.out.print(third[i]);   
            System.out.print(", ");           
        }
        System.out.println();
        
    }
    
}
