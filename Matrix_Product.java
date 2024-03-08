import java.util.Scanner;

public class Matrix_Product {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Matrix_Product obj = new Matrix_Product();

        System.out.print("Enter the no of rows of first matrix : ");
        int a = n.nextInt();
        System.out.print("Enter the no of columns of first matrix : ");
        int b = n.nextInt();

        int[][] mat1 = new int[a][b];
        System.out.println("Enter the elements of first matrix : ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print("a"+i+j+" : ");
                mat1[i][j] = n.nextInt();
            }
        }
        
        System.out.print("Enter the no of rows of second matrix : ");
        int c = n.nextInt();
        System.out.print("Enter the no of columns of second matrix : ");
        int d = n.nextInt();

        int[][] mat2 = new int[c][d];
        System.out.println("Enter the elements of second matrix : ");
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<d; j++)
            {
                System.out.print("b"+i+j+" : ");
                mat2[i][j] = n.nextInt();
            }
        }
        System.out.println();

        System.out.println("Your entered first matrix is : ");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print(mat1[i][j]);
                System.out.print("      ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Your entered second matrix is : ");
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<d; j++)
            {
                System.out.print(mat2[i][j]);
                System.out.print("      ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The product of above matrices is : ");
        int[][] mat3 = new int[b][c];

        for(int i=0; i<b; i++)
        {
            for(int j=0; j<c; j++)
            {
                int y = 0;
                for(int k=0; k<b; k++)
                {
                    int x = 0;
                    x  = mat1[i][k] * mat2[k][j];
                    y += x;
                }
                mat3[i][j] = y;
            }
        }
        for(int i=0; i<b; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(mat3[i][j]);
                System.out.print("      ");
            }
            System.out.println();
        }
        System.out.println();


    }
          
    
}
