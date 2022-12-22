class first {
    void fun() {
        System.out.println("Shivam this side");
    }
}
class second extends first {
    void fun() {
        System.out.println("Hello my name is Shivam");
    }
    void use() {
        super.fun();
        fun();
    }
}


public class super_method {
    public static void main(String[] args) {
        second s= new second();
        s.use();
    }
}
