public class if_else_1 {
    public static void main(String[] args) {
        int marks = 95;

        if(marks<50)
        {
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<75)
        {
            System.out.println("C grade");
        }
        else if(marks>=75 && marks<90)
        {
            System.out.println("B grade");
        }
        else if(marks>=90 && marks<100)
        {
            System.out.println("A+ grade");
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
    
}
