import java.util.Scanner;;

public class ascii_value {
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);

        System.out.println("Enter the character : ");
        char a = ask.next().charAt(0);

        int ascii = a;

        System.out.println("Ascii Value is : "+ascii);
    }

}
