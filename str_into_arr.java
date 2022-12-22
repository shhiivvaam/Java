public class str_into_arr {
    public static void main(String[] args) {
        String str = "Hello my name is shivam i am new in thi field but i know i can do good infact very good in this field";

        char [] arr = new char [100];

        str.getChars(0, 23, arr,0);
        
        System.out.println(arr);

    }
}