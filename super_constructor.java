class first {
    first() {
        System.out.println("HEllo my name is Shivam");
    }
}
class second extends first{
    second() {
        super();
        System.out.println("Shivam this side");
    }
}

public class super_constructor {
    public static void main(String[] args) {
        second s = new second();
    }
}
