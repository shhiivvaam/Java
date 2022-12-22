import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        // 1D Array


        int[] age = new int[3]; 
        age[0] = 5;
        age[1] = -1;
        age[2] = 99; 
        
                       // or } int[] age = {5, -1, 99};

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        // length_Array
        System.out.println("\n");
        System.out.println(age.length);

        System.out.println("\n");

        // sort
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        Arrays.sort(age);
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        boolean[] age1 = new boolean[3];
        age1[0] = true;
        age1[1] = false;
        age1[2] = true;

        System.out.println(age1[0]);
        System.out.println(age1[1]);
        System.out.println(age1[2]);

        boolean[] age2 = new boolean[3];
        // age2[0] = 0;
        // age2[1] = 1;
        // age2[2] = 2;

        System.out.println(age2[0]);
        System.out.println(age2[1]);
        System.out.println(age2[2]);



        // 2D Array

        int[][] marks = {{1,2,3,4,5},{6,7,8,9,10}};    //or     //int[][] marks = new int[5][5];
        System.out.println(marks[0][0]);
        System.out.println(marks[0][1]);
        System.out.println(marks[0][2]);
        System.out.println(marks[0][3]);
        System.out.println(marks[0][4]);
        
        System.out.println("\n");
        
        System.out.println(marks[1][0]);
        System.out.println(marks[1][1]);
        System.out.println(marks[1][2]);
        System.out.println(marks[1][3]);
        System.out.println(marks[1][4]);


    }
}