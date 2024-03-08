import java.util.Scanner;


public class Same_func_name {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        Same_func_name obj = new Same_func_name();

        System.out.print("Enter the radius of circle : ");
        int r = n.nextInt();

        System.out.print("Enter the length of rectangle : ");
        int l = n.nextInt();

        System.out.print("Enter the breadth of rectangle : ");
        int b = n.nextInt();

        float area_circle = obj.area(r);

        int area_rectangle = obj.area(l, b);

        System.out.println();

        System.out.println("Area of circle is : " + area_circle);
        System.out.println("Area of rectangle is : " +  area_rectangle);

        System.out.println();

    }

    // Function to find area of circle
    public float area(int r)
    {
        float x = 3.14f*r*r;
        return x;
    }

    // Function to find area of rectangle
    public int area(int a, int b)
    {
        int y = a*b; 
        return y;
    }
    
}
