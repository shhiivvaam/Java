import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int fac = ask.nextInt(), temp = 1;

        for(int i=1;i<=fac;i++) {
            temp = temp*i;
        }

        System.out.println("Factorial of "+fac+" is "+temp);
    }
}
