class cat{
    String name= " Jack ";



}

class info extends cat{
    int age= 4;
}

public class Exam_Inheritance {
    public static void main(String[] args) {
        info obj = new info();
        System.out.println("My pet name is " + obj.name);
        System.out.println("and age is " + obj.age);    }
}
