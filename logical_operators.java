public class logical_operators {
    public static void main(String[] args) {
        // &&
        // ||


        // &&
        int a = 50, b = 60;
        
        if (a>50 && b>50){
            System.out.println("hell world!");
        }
        else{
            System.out.println("hello there!");
        }


        System.out.println("\n");
        
        
        // ||
        if(a==10 || b==60){
            System.out.println("how are u!");
        }
        else{
            System.out.println("u r not fine!");
        }
        
        
        System.out.println("\n");
        
        
        // ! 
        if(a!=b)
        {
            System.out.println("i m fine");
        }
        else{
            System.out.println("i m not fine");
        }
        
        
        System.out.println("\n");


        // !
        boolean chk = false;

        if(chk){
            System.out.println("true");
        }
        if(!chk){
            System.out.println("not if true");
        }
        else{
            System.out.println("else true");
        }

        }
    }
