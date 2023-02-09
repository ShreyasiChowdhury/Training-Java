import java.util.Scanner;
public class qstn16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Enter operator:\n+ - * /");
        char op=sc.next().charAt(0);
        double res=0;
        switch(op)
        {
            case '+':
                res=a+b;
                System.out.println("Result: "+res);
                break;
            case '-':
                res=a-b;
                System.out.println("Result: "+res);
                break;
            case '*':
                res=a*b;
                System.out.println("Result: "+res);
                break;
            case '/':
                res=a/b;
                System.out.println("Result: "+res);
                break;
            default:
                System.out.println("Invalid");
                System.exit(0);
        }
    }
}