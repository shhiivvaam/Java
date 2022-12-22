// Print Prime no. till a particular point

// import java.util.Scanner;
// public record prime_no() {
//     public static void main(String[] args)
//     {
//         Scanner ask = new Scanner(System.in);

//         int i, n = ask.nextInt();

//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("5");
//         System.out.println("7");

//         for(i=3;i<n;i++) {
//             if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%i==0 && i%1==0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// Check weather a number is prime or not

// import java.util.Scanner;

// public  class prime_no {
//     public static void main(String[] args) {

//         Scanner ask = new Scanner(System.in);

//         System.out.print("Enter the no. : ");
//         int n =  ask.nextInt();

//         if(n==0 && n==1) {
//             System.out.println("Not Prime");
//         }
//         else if((n==2) && (n == 3) && (n == 5) && (n == 7)){                 // ask about this code, that why its not working
//             System.out.println("Prime");
//         }
//         else if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0) {
//             System.out.println("Prime");
//         }
//         else if (n%2==0 && n%3==0 && n%5==0 && n%7==0){
//             System.out.println("Not Prime");
//         }


//     }
// }


// import java.util.Scanner;
// public class prime_no {
//     public static void main(String[] args) {
        
//         Scanner ask = new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int input = ask.nextInt();

        // if(input>1) {
//             for(int i=input;i<=input;i++) {
//                 if(input%1==0 || input%input==0) {
//                     System.out.println("Prime");
//                 }
//             }
//         }
//         else {
//             System.out.println("Not Prime");
//         }

//     }
// }

// import java.text.BreakIterator;
// import java.util.Scanner;
// public class prime_no {
//     public static void main(String[] args)
//     {
//         Scanner ask = new Scanner(System.in);
//         System.out.println("Enter a Number : ");
//         int n = ask.nextInt();

//         int a = 0;
        
//         if(n==0 || n==1) {
//             System.out.println("Not Prime");
//         }
//         else {
//             for (int i=2;i<=n-1;i++) {
//                 if (n%i==0){
//                     a++;
//                 }
//             }
//         }


//         if(a==0) {
//             System.out.println("Prime");
//         }
//         else {
//             System.out.println("Not Prime");
//         }


//     }
// }

// import java.util.Scanner;
// public class prime_no{    
//     public static void main(String args[]){    
//     int i,m=0,flag=0;   
    
//     Scanner ask = new Scanner(System.in);
//     int n = ask.nextInt(); //it is the number to be checked    
//     m=n/2;      
//     if(n==0||n==1){  
//     System.out.println(n+" is not prime number");      
//     }
//     else{  
//         for(i=2;i<=m;i++){      
//             if(n%i==0){      
//                 System.out.println(n+" is not prime number");      
//                 flag=1;      
//                 break;      
//             }      
//         }      
//     if(flag==0)  { 
//         System.out.println(n+" is prime number"); }  
//     }//end of else  
//     }    
// }

// import java.util.Scanner;
// public class prime_no {
//     public static void main(String[] args) { 

//         Scanner ask = new Scanner(System.in);
//         System.out.println("Enter the no. : ");
//         int n = ask.nextInt();
//         int i,count = 0;

//         if(n==0 || n==1) {
//             System.out.println("Not Prime");
//         }
//         else {
//             for(i=2;i<=n-1;i++) {
//                 if(n%i==0) {
//                     count = 1;
//                     System.out.println("Not Prime");      // ask kro isse, kafi dimag kharab kr rha hai
//                     break;
//                 }
//                 else {
//                     System.out.println("Prime");
//                     break;
                    
//                 }
//             }
//         }
//     }
// }