import java.lang.annotation.Target;
import java.util.Scanner;

public class given_nums_and_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();

        int target = sc.nextInt();

        int [] arr = new int [nums];

        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++) {
            for(int j = i;j<arr.length;j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("[" + i+ " , "+ j +"]");
                }
            }
        }
    }
}
