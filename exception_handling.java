public class exception_handling {
    public static void main(String[] args)
    {
        int[] mera = {1,2,3,4,5};
        try {
            System.out.println(mera[10]);
        }
        catch(Exception exception) { 
            System.out.println("my name is shivam");
        }
    }
}