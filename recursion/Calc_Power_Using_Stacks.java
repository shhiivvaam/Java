public class Calc_Power_Using_Stacks {

    public static int Calculate_Power(int x, int n) {
        if(n == 0) {     // base case 1
            return 1;
        }
        if(x == 0) {     // base case 2
            return 0;
        }

        // if n is even
        if(n % 2 == 0) {
            return Calculate_Power(x, n/2) * Calculate_Power(x, n/2);
        }
        else {
            return Calculate_Power(x, n/2) * Calculate_Power(x, n/2) * x;
        }
    }
    public static void main(String[] args) {

        int x = 2, n = 5;
        int ans = Calculate_Power(x,n);
        System.out.println(ans);
    }
}
