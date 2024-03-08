import java.util.Scanner;

public class Read_lines {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.println("Enter the line you want to see on screen : ");
        String a = i.nextLine();
        System.out.print("You entered : ");
        System.out.println(a);

    }
    
}
