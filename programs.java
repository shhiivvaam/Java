// // cheking the days inputted by the user ,and answering via Switch Statement

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args)
//     {
//         Scanner ask = new Scanner(System.in);
        
//         final int pen = 10, copy = 40;

//         System.out.println("how mauch money you have");
//         int paise = ask.nextInt();

//         if(paise<10){
//             System.out.println("you cannot buy anything");
//         }
//         else if((paise>10 || paise==10) && paise<40){
//             System.out.println("you can only buy a pen");
//         }
//         else if(paise==40){
//             System.out.println("you can either buy pens or a copy");
//         }
//         else if(paise>40 && paise<50){
//             System.out.println("you can either buy pens or a copy");
//         }
//         else if(paise>50){
//             System.out.println("you can but both pen and copy with some extra things");
//         }
//         else if(paise==50){
//             System.out.println("you can buy both pen and copy");
//         }
//         // if((paise>40 && paise<50){
//         //     System.out.println("you can only buy a copy");
//         // }
//     }
// }


// // printing the user givan value till it's not negative
// import java.util.Scanner;
// public class programs {
//     public static void main(String[] args)
//     {
//         Scanner ask = new Scanner(System.in);
//         int i = 0;

//         // while(i>=0) {
//             // i = ask.nextInt();
//         // }

//         do {
//             i = ask.nextInt();
//             } while (i>=0);
        
        

//         // Scanner sc = new Scanner(System.in);
//         // int number = 0;

//         // do {
//         //     // System.out.println("input a number");
//         //     number = sc.nextInt();
//         //     // System.out.print("here is yout number : ");
//         //     // System.out.println(number);
//         // } while(number >= 0);

//     }
// }



// // funtion ques : finding sum of numbers

// public class programs {

// public static void sum(int a, int b) {
//     int sum = a + b;
//     System.out.println(sum);
// }

//     public static void main(String[] args) {
//         int a = 5,b = 6;
//         // sum(5,6);
//         sum(a,b);
//     }
// }


// Mini_Poject

// GUESSING THE NUMBER

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {

//         Scanner ask = new Scanner(System.in);

//         System.out.println("\t\tGuess The Number\n");

//         int random = (int)(Math.random()*100);

//         int input = 0;

//         do {
//             System.out.println("Guess the Number : \n");
//             input = ask.nextInt();
//             System.out.println("\n");
            
//             if(input == random) {
//                 System.out.println("yeah!! you guessed right\n");
//                 break;
//             }
//             else if(input < random) {
//                 System.out.println("your number is smaller\n");
//             }
//             else {
//                 System.out.println("your number is larger\n");
//             }

//         } while (input >= 0);

//         System.out.println("The number is : "+random+"\n");
//     }
// }


// Same Mini_Project with some add-ons : this will also tell you how any time you were wrong in guessing the correct number

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {

//         Scanner ask = new Scanner(System.in);

//         System.out.println("\t\tGuess The Number\n");

//         int random = (int)(Math.random()*100);

//         int input = 0, found = 0, smaller = 0, greater = 0;

//         do {
//             System.out.println("Guess the Number : \n");
//             input = ask.nextInt();
//             System.out.println("\n");
            
//             if(input == random) {
//                 System.out.println("yeah!! you guessed right\n");
//                 found++;
//                 break;
//             }
//             else if(input < random) {
//                 System.out.println("your number is smaller\n");
//                 smaller++;
//             }
//             else {
//                 System.out.println("your number is larger\n");
//                 greater++;
//             }

//         } while (input >= 0);

//         System.out.println("The number is : "+random+"\n");

//         System.out.println("And You guessed wrong : "+(smaller+greater)+"times");
//     }
// }

import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Scanner;

class progrsms {
    public static void main(Strings[] args) {
        Scanner ask = new Scanner(System.in);
        n = ask.nextInt();
        Solution(n);
    }
}

public programs Solution(int n) {
    for(int i=0;i<n;i++) {
        if(i%3==0 && i%5==0) {
            System.out.println("FizzBuzz");
            break;
        }
        else if(i%3==0 && i%5!=0)
        {
            System.out.println("Fizz");
            break;
        }
        else if(i%5==0 && i%3!=0) {
            System.out.println("Buzz");
            break;
        }
        else {
            System.out.println(i);
            break;
        }
    }
}

