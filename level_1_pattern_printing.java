
// *
// * *
// * * *
// * * * *
// * * * * *

// import java.util.Scanner;
// public level_1_pattern_printing {
//     public static void main(String[] args) {
//         Scanner ask = new Scanner(System.in);
//         System.out.println("Enter the no of lines for your pattern : ");
//         int input = ask.nextInt();

//         for(int i=0;i<input;i++) {
//             // System.out.print("*");
//             // System.out.println();
//             for(int j=0;j<=i;j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//         *
//       * *
//     * * *
//   * * * *
// * * * * *
// import java.util.Scanner;
// public level_1_pattern_printing {
//     public static void main(String[] args) {
//         Scanner ask = new Scanner(System.in);
//         System.out.println("Enter the no of lines for your pattern : ");
//         int input = ask.nextInt();

//         for(int i=input;i>0;i++) {
//             // System.out.print("*");
//             // System.out.println();
//             for(int j=i;j<=i;j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class level_1_pattern_printing {

public static void main(String[] args)  
{  
int rows=7;      
//inner loop  
for (int i= rows-1; i>=0 ; i--)  
{  
//outer loop  
for (int j=0; j<=i; j++)  
{  
//prints star and space  
System.out.print("*" + " ");  
}  
//throws the cursor in the next line after printing each line  
System.out.println();  
} 
}
} 