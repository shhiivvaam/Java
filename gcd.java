public class gcd {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sm = Math.min(a,b);

        for(int i = sm;i>0;i--) {
            if(a%i == 0 && b%i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
