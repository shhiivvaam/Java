public class split_string {
    public static void main(String[] args) {
        String s = "Shivam is a good boy and he can do anything he wants";

        for(String str : s.split(" ")) {
            System.out.println(str);
        }

        System.err.println(s);

        String [] ss = s.split(" ");

        for(int i = 1;i<ss.length;i++) {
            System.out.println(ss[i]);
        }

        for(String arr : s.split(" ")) {
            System.out.println(arr);
        }
    }
}