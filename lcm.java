public class lcm {
    public static void main(String[] args) {

        int a = 4;
        int b = 8;

        int gr = Math.max(a, b);

        for(int i = gr;i<=a*b;i++) {
            if(i%a == 0 && i%b == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}
