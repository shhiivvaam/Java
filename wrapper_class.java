class wrapper {
    static void wrapp(int... a) {
        for(int i : a) {
            System.out.println("value : "+i);
            System.out.println(a.length);
        }
    }
}
public class wrapper_class {
    public static void main(String[] args) {
        wrapper.wrapp(100);
        wrapper.wrapp(1,2,3,4,5,6,7,8,9,10);
        wrapper.wrapp(10,9,8,7,6,5,4,3,2,1);
    }
}
