// import java.util.Scanner;
// public class fabonacci_series {
    
//     public static void main(String[] args)
//     {
//         Scanner ask = new Scanner(System.in);
        
//         System.out.println("Enter the term till you want the fabonacci series");
//         int n = ask.nextInt();

//         int a = 0, b = 1, sum = 0;

//         for(int i=0;i<n;i++) {
                
                // 3System.out.println(sum);
//             sum = a+b;
//             b = sum;
//             a = b;
//             
//         }
        
//     }
// }

// import java.util.Scanner;
// class fabonacci_series {  
// public static void main(String args[])  
// {    
//     Scanner ask = new Scanner(System.in);

//     int count = ask.nextInt();

//     int n1=0,n2=1,n3,i;    
//     System.out.print(n1+" "+n2);//printing 0 and 1    
    
//     for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
//     {    
//     n3=n1+n2;    
//     System.out.print(" "+n3);    
//     n1=n2;    
//     n2=n3;    
//     }
//     }
// }  

import java.util.Scanner;

public class fabonacci_series {
    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);
        int n = ask.nextInt();

        int a=0,b=1,c,i;

        System.out.println(a);
        System.out.println(b);

        for(i=0 ;i<n-2 ;i++) {
            c = a+b;
            System.out.println(c);

            a = b;
            b = c;
        }
    }
}