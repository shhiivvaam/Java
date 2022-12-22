public class power_without_recurson {

    public static void recursive_call(int n){

        if(n == 0) {
            return;
        }

        // System.out.println(recursive_call(n-1));

        System.out.println(n);
        recursive_call(n-1);

        // System.out.println(recursive_call(n-1));

    }
    public static void main(String[] args) {

        int n = 5;
        recursive_call(n);
    }
}

// public static void main(String[] args) {
//         increase(10,1);
//     }
//     private static  void increase(int N,int begin){

//         if(begin <= N){
//             System.out.print(begin+" ");
//             begin=begin+1;
//             increase(N,begin);
//         }
//         return;
//     }



