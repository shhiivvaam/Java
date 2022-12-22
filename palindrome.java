import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter the no to check : ");
        int chk = ask.nextInt();

        int copy = chk, rem, num = 0;

        while(chk>0) {
            rem = chk%10;
            num = (num*10)+rem;
            chk = chk/10;
        }

        if(num == copy) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
