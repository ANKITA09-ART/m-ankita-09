//user input method
import java.util.Scanner;
public class calculation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    

        int a, b, sum, diff, mul, div;

        System.out.println("Enter 1st number:");
        a = sc.nextInt();

        System.out.println("Enter 2nd number:");
        b = sc.nextInt();

        System.out.println("Enter 1st number:");
        a = sc.nextInt();

        System.out.println("Enter 2nd number:");
        b = sc.nextInt();

        sum = a + b;
        diff = a - b;
        mul = a * b;
        div = a / b;

        System.out.println("sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
    }
}
