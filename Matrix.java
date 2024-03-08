import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Matrix {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int a = n.nextInt();
        System.out.print("Enter no of columns : ");
        int b = n.nextInt();

        System.out.println("Enter the values in matrix : ");
        int[][] mat = new int[a][b];
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print("a"+i+j+": ");
                mat[i][j] = n.nextInt();                
            }
        }

        System.out.println();
        System.out.println("The matrix is : ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print(mat[i][j]);
                System.out.print("     ");
            }
            System.out.println();
        }
        System.out.println();

    }
    
}
