public class use_stringbuffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb = sb.append("Shivam is a  good");
        System.out.println(sb.capacity());
        // sb.append("Shivam");
        // sb.append("Shivam");
        // sb.append("Shivam");
        // System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer(1000);
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(10000);
        System.out.println(sb1.capacity());
    }
}
