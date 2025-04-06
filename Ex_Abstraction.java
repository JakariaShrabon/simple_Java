

// Let's put some example here
abstract class bike{
    int price;
}
class Info extends bike{

}
public class Ex_Abstraction {


       public static void main(String[] args) {
           Info myInfo = new Info();
           // Here we cannot make a object directly of bike class but we can make a object it inheritance class
           //And Access their abtribute
             myInfo.price = 500000;
             System.out.println(myInfo.price);
       }


}
