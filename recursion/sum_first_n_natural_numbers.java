public class sum_first_n_natural_numbers {

    public static int printnsum(int n) {

        int sum = 0;

        if(n==0) {
            return 0;
        }
        sum += n;

        System.out.println(sum);

        return sum + printnsum(n-1);

    }

    public static void main(String[] args) {
        int x = printnsum(5);
        System.out.println(x);
    }
}