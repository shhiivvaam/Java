import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();

        // System.out.println();

        // for (int i = 1; i <= num; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i + " Is Even");
        //     } else {
        //         System.out.println(i + " Is Odd");
        //     }
        // }

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
            System.out.print("\n" + i + " Is Even");
            }
            else {
                System.out.print("\n" + i + " Is Odd");
            }
        }

    }
}
