public class str_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());

        sb.append(sb);
        System.out.println(sb.capacity());

        sb.append(sb);
        System.err.println(sb.capacity());       // appending the empty string will not effect the values of the capacity of string

        sb.append("Hello ");
        System.out.println(sb.capacity());           // till appending any first string , it will gove 16 as the output :  which is the capacity of string : but only till the addition of one string , now if you will add some more string then it will raise its capacity to {(oldcapacity*2)+2}

        sb.append("Hello ");
        sb.append("Hello ");
        sb.append("Hello ");
        sb.append("Hello ");
        
        System.out.println(sb.capacity());

        System.out.println(sb);
    }
}
