class a {
    int number() {
        return 0;
    }
}
class b extends a {
    int number() {
        return 10;
    }
}
class c extends a {
    int number() {
        return 20;
    }
}


public class dynamic_dispatch {
    public static void main(String[] args) {
        a a;
        
        a = new a();
        System.out.println(a.number());

        a = new b();
        System.out.println(a.number());

        a = new c();
        System.out.println(a.number());
    }
}
