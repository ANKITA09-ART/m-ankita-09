import java.util.Scanner;

public class vowel_consonent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        char i;

        System.out.println("Enter any character:");
        i = sc.next().charAt(0);

        if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
            System.out.println(i + " is a vowel");
        else
            System.out.println(i + " is a consonant");
    }
}