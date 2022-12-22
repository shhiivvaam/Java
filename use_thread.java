public class use_thread extends Thread{

    public void run() {                         // overriding the run mehtod that is alrady present in the thread class (provided by java)
        // tasks of running the thread class
    }
    public static void main(String[] args) {
        use_thread ut = new use_thread();               // creating an object of the class
        ut.start();                                  // starting the thread
    } 
}
