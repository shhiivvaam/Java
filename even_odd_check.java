import java.util.Scanner;

public class even_odd_check {
    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);
        int nums = ask.nextInt();

        int [] arr = new int [nums];

        for(int i = 0;i<arr.length;i++) {
            arr[i] = ask.nextInt();
        }

        for(int i = 0;i<arr.length;i++) {
            if(arr[i] % 2 == 0) {
                System.err.println(arr[i] + " is Even");
            }
            else {
                System.out.println(arr[i] + "is Odd");
            }
        }
    }
}
