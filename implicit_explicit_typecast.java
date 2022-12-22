public class implicit_explicit_typecast {
    public static void main(String[] args) {
        int i = 10;
        long l = i;
        float f = i;                   // implicit typecast

        System.out.println(i);
        System.out.println(l);
        System.out.println(f);

        int c = (int)f;                // explicit typecast 
        System.out.println(c);
    }
}