package creational.builder;

/**
 * Created by PriyabratP on 04-07-2017.
 */
public class BuilderMain {

    /*
    -> This should be used only when you want to build different immutable objects using same object building process.
    -> Builder pattern builds a complex object using simple objects and using a step by step approach

    Why?
    ->
    ->


    Adv:
    -> Easy to understand as it increases code readability.
    -> No need to call lengthy constructor arguments

    Disadvantages:
    -> Lengthy code. No of code lines increases
    */

    public static void main(String[] args){
        UserAccount userAccount = new UserAccount.Builder("Priyabrat Padhy","pp@gmail.com")
                .age(26)
                .city("Bangalore")
                .mobile("123")
                .build();
        userAccount.toString();
    }
}
