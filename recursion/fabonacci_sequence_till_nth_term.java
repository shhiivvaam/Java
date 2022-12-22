public class fabonacci_sequence_till_nth_term {

    public static void fabboseries(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a + b;

        System.out.println(c);

        fabboseries(b, c, n-1);
    }
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        fabboseries(a,b,n-2);
    }
}
