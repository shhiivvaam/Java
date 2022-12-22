public class print_1_to_5 {
    public static void printnumbers(int n) {

        if(n==6) {
            return;
        }
        System.out.println(n);
        printnumbers(n+1);
    }
    public static void main(String[] args) {
        printnumbers(1);
    }
}
