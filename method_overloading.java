class examplemethodoverloading {
    void example(int x){
        int c = x+10;
        System.err.println(c);
    }
    int example(int x, int y){
        int c = x+y;
        return c;
    }
    float example(float x, float y) {
        float c = x+y;
        return c;
    }
}
public class method_overloading {
    public static void main(String[] args) {
        examplemethodoverloading em = new examplemethodoverloading();
        em.example(10);
        int x = em.example(10, 20);
        float y = em.example(10.0f, 20.0f);

        System.out.println(x);      
        System.out.println(y);
    }   
}
