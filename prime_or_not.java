import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();

        int [] arr = new int [nums];

        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++) {
            int flag = 0;

            for(int j = 2;j<arr[i];j++) {
                if(arr[i] % j == 0) {
                    flag = 1;
                    break;
                }
                if(flag == 0) {
                    System.out.println(arr[i]+ " ");
                }
            }
        }
    }
}
