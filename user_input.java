import java.util.Scanner;

public class user_input {
    public static void main(String[] args)
    {
        Scanner first = new Scanner(System.in);          
        System.out.println("enter the scanner value : ");
        
        // String primarytokenString = first.next();
        // System.out.println(primarytokenString);
        
        String primarylineString = first.nextLine();
        System.out.println(primarylineString);
        // System.out.println("your string } "+primarylineString);


        double second = first.nextDouble();
        long third = first.nextLong();
        byte fourth = first.nextByte();
        float fifth = first.nextFloat();
        int sixth = first.nextInt();
        char seventh = first.next().charAt(0);
        
        System.out.println("\n");

        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);
    }
}