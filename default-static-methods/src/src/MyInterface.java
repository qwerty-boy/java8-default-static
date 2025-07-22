package src;

public interface MyInterface {

    default void test(){
        System.out.println("my test");
    }

    static  void display(){
        System.out.println("Print MyInterface");
    }
}
