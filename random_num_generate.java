public class random_num_generate {
    public static void main(String[] args)
    {
        // Scanner ask = new Scanner(System.in);
        // double first = ask.nextInt();
        // double second = ask.nextInt();

        // double cmp1 = new Double(first);
        // double cmp2 = new Double(second);


        // int cmp = cmp1.equals(cmp2);

        Double first = new Double(123.45555); 
        
        Long second = new Long(12321241); 

        System.out.println(first.equals(second));
        System.out.println(first.equals(123.45555));
        System.out.println(first.equals(12321241));
        
        System.out.println("\n");

        System.out.println(second.equals(first));
        System.out.println(second.equals(123.45555));
        System.out.println(second.equals(12321241));
        
        
    }
}
