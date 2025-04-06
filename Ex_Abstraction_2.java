package Java_collections;

// Let's put some example here
abstract class bike{
    int price;
    abstract void color();
}
class Info extends bike{
    void color(){
        System.out.println("Red");
    }
}
public class Ex_Abstraction_2{


       public static void main(String[] args) {
           Info myInfo = new Info();
           // Here we cannot make a object directly of bike class but we can make a object it inheritance class
           //And Access their abtribute
             myInfo.price = 500000;
             System.out.println(myInfo.price);
             // we can access abrstract method only by his inhreitance class
             myInfo.color();
       }


}
