public class factorial_of_a_number {

    public static int printfact(int n) {

        int fact = 1;

        if(n == 1 || n == 0) {
            return 1;
        }

        fact *= n;

        return fact * printfact(n-1);
    }

    public static void main(String[] args) {
        int x = printfact(5);
        System.out.println(x);
    }
}
