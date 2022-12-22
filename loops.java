public class loops {
    public static void main(String[] args) {


        // for loop
        for (int i = 100; i >= 1; i--) {
            // i = i+1
            System.out.println(i); // this will print from 100 to 1 numbers
        }
        System.out.println("\n");


        // while loop
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("\n");
        
        
        // do while loop
        int k = 100;
        do {
            System.out.println(k);
            k = k-1;
        } while (k >= 1);
        System.out.println("\n");

    }
}