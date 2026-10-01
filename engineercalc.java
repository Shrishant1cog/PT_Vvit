
import java.util.Scanner;

public class engineercalc {
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice;
        while(!exit)
        {
            calc calcs = new calc();

            System.out.println("Choose your method\nFor additon ----------> 1\nFor subtraction ------> 2\nFor multiplication ---->3\nFor division ---------> 4\nFor exit ----------> 5 : ");
            
            choice = sc.nextInt();
            
            int num1 ;
            int num2 ;

            switch(choice)
            {

            
            case 1:
                System.out.println("Enter two numbers\n:");
                num1 =  sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(calcs.add(num1,num2));
                break;
            case 2:
                System.out.println("Enter two numbers\n:");
                num1 =  sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(calcs.sub(num1,num2));
                break;
            case 3:
                System.out.println("Enter two numbers\n:");
                num1 =  sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(calcs.mul(num1,num2));
                break;
            case 4:
                System.out.println("Enter two numbers\n:");
                num1 =  sc.nextInt();
                num2 = sc.nextInt();
                System.out.println(calcs.div(num1,num2));
                break;
            case 5:
                System.out.println(":Exiting... ");
                exit = true;
                break;
            default:
                System.out.println("Invalid option  ");
                break;
            

            }
            
            
        }
        sc.close();
        

    }
}
    class calc{

    
    int add(int a, int b)
    {
            return a+b;
    }
    int sub(int a, int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
}
