import java.util.Scanner;
public class armstrong {
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int arm = ask.nextInt();
        int copy = arm, first = 0, chk = 0, rem, quo, digits = 0;


        while(copy>0) {
            copy = copy/10;
            digits++;
        }
        copy = arm;

        while(copy>0) {
            first = copy%10;
            chk = chk + (int)(Math.pow(first , digits));
            copy = copy/10;
        }

        if(arm == chk) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
