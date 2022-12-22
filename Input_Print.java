import java.util.Scanner;

public class Input_Print{
    
    public static void main(String[] args) {
        
        Scanner ask = new Scanner(System.in);
        
        System.out.println("Enter the total no of elements for the array : ");
        int input = ask.nextInt();

        int [] arr = new int[input];

        for(int i = 0;i<input;i++) {
            arr[i] = ask.nextInt();
        }

        for(int i = 0;i<input;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}