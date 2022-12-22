public class intro {
    public static void main(String args[])
    {

        // Non-Primitive Types


        String name = new String("Shivam");
        String name2 = new String(name);
        String name3 = new String(name+"\t"+name2);
        
        
        System.out.println(name.length());
        System.out.println(name2.length());
        System.out.println("\n");
        System.out.println(name3);
        System.out.println(name3.length());
        
        // CharAt
        System.out.print(name.charAt(0));
        System.out.print("\t");
        System.out.print(name.charAt(1));
        System.out.print("\t");
        System.out.print(name.charAt(2));
        System.out.print("\t");
        System.out.print(name.charAt(3));
        System.out.print("\t");
        System.out.print(name.charAt(4));
        System.out.print("\t");
        System.out.print(name.charAt(5));
        System.out.print("\n");
        
        
        //replace
        String chkreplace =  name.replace('S','s');
        name.replace('S','s');
        
        
        System.out.println(chkreplace);
        System.out.println(chkreplace.length());
        System.out.println(chkreplace.charAt(0));
        System.out.println(name.charAt(0));
        
        System.out.println("\n");
        System.out.println(name);
        
        
        //subString                                  // Remember : STRINGS are IMMUTABLE
        String sub = "Somya";
        String sub1 = "Surbhi";
        String sub2 = "heelo there who are you";
        String chk = sub.substring(0,5);
        String chk1 = sub1.substring(0,6);
        String chk2 = sub2.substring(0,23);
        System.out.println(chk);
        System.out.println(chk1);

        System.out.println("\n");
        
        System.out.println(chk2);
        
        System.out.println("\n");

        System.out.println(sub);
        System.out.println(sub1);
        System.out.println(sub2);


        // Primitive Types 


        // byte age = 30;
        // int phone = 1234567890;
        // long phone1 = 12345678900L;
        // float pi = 3.14F;
        // char letter = '@';
        // boolean isAdult = true;


    }
}
