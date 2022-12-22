class exampleinstanceandstaticvariable { 
    int instancevariable = 10;
    static int staticvariable = 20;
}
public class instance_and_static_variable {
    public static 
    void main(String[] args) {
        int x = exampleinstanceandstaticvariable.staticvariable;

        exampleinstanceandstaticvariable eis = new exampleinstanceandstaticvariable();
        int y = eis.instancevariable;

        System.out.println(x);
        System.out.println(y);
    }
}
