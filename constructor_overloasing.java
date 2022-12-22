class exampleconstructoroverload {

    int first = 10;
    int second = 10;

    exampleconstructoroverload(){
        first = 0;
        second = 0;
    }
    exampleconstructoroverload(int first, int second) {
        this.first = first;
        this.second = second;

        int add = this.first + this.second;
        System.out.println(add);
    }
    exampleconstructoroverload(int first, int second, int third) {
        this.first = first;
        this.second = second;

        int add = first+second+third;
        System.out.println(add);
    }
}

public class constructor_overloasing {
    public static void main(String[] args) {
        exampleconstructoroverload ec = new exampleconstructoroverload();
        exampleconstructoroverload ec2 = new exampleconstructoroverload(10,20);
        exampleconstructoroverload ec3 = new exampleconstructoroverload(10,20,30);
    }
}
