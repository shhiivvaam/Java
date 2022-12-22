public class n_1_recursion {

    public static int recursive_call(int n){
        if(n == 0) {
            return n;
        }
        return recursive_call(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = recursive_call(n);
        System.out.println(ans);
    }
}
