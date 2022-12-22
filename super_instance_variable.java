class first {
    int val = 200;
}
class second extends first {
    int val = 100;
    void fun() {
        System.out.println("second class : "+val);
        System.out.println("first class : "+super.val);
    }
}

public class super_instance_variable {
    public static void main(String[] args) {
        second s = new second();
        s.fun();
    }
}
