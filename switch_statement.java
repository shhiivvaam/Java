import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);

        System.out.println("enter the day");
        int day = ask.nextInt();

        switch(day){
            case 1 : System.out.println("monday");
                break;
            case 2 : System.out.println("tuesday");
                break;
            case 3 : System.out.println("wednesday");
                break;
            case 4 : System.out.println("thrusday");
                break;
            case 5 : System.out.println("friday");
                break;
            case 6 : System.out.println("saturday");
                break;
            case 7 : System.out.println("sunday");
                break;
            default  : System.out.println("invalid day");
        }
    }
}