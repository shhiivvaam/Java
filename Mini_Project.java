// code of guessing the number : MINI PROJECT


import java.util.Scanner;

public class Mini_Project {
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);

        System.out.println("\t\tGuessing the number btw(1-100)");

        int random = (int)(Math.random()*100);

        System.out.print(random);

        System.out.println("\n");

        // System.out.println("Please enter a number betweem 1 to 100");

        // int input = ask.nextInt();

        // System.out.println(input);

        // if(input<random) {
        //     System.out.println("you have choosen a smaller number, go for higher");
        // }
        // if (input>random) {
        //     System.out.println("you have choosen a greater number, go for smaller");                   // ye bich ka code mera hai jo try kia tha maine par galat nikla
        // }
        // if(input == random) {
        //     System.out.println("congrats, you have predicted the exact noumber");
        // }

        int input = 0;
    
        do {
            System.out.println("Guess the number : ");
            
            input = ask.nextInt();
        
            if(input == random) {
                System.out.println("congrats you found the random no.");
                break;
            }
            else if(input < random) {
                System.out.println("your number is smaller");
            }
            else {
                System.out.println("your number is larger");
            }

        } while (input>=0);

        System.out.println("number was : "+random);

    }
}


// apni kaksha ka program tepa hua 

// import java.util.Scanner;

// public class Mini_Project {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int myNumber = (int) (Math.random() * 100);
//         int userNumber = 0;
//         do {
//             System.out.println("Guess my number:");
//             userNumber = sc.nextInt();
//             if (userNumber == myNumber) {
//                 System.out.println("WOOHOO .. CORRECT NUMBER !!!");
//                 break;
//             } else if (userNumber > myNumber) {
//                 System.out.println("your number is too large");
//             } else {
//                 System.out.println("your number is too small");
//             }
//         } while (userNumber >= 0);

//         System.out.print("My number was:");
//         System.out.println(myNumber);
//     }
// }
