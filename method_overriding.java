class method {
    void fun() {
        System.out.println("Hello! my name is Shivam");
    }
}
class method2 extends method {
    void fun() {
        System.out.println("Hello dear, how are you");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        method2 m = new method2();
        m.fun();
    }
}
