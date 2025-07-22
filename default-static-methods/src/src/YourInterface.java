package src;

public interface YourInterface {

    default void test(){
        System.out.println("your test");
    }

    static  void display(){
        System.out.println("Print YourInterface");
    }
}
