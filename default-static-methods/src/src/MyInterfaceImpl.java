package src;

public class MyInterfaceImpl implements MyInterface,YourInterface {

    @Override
    public void test() {
        MyInterface.super.test();
        MyInterface.super.test();
        YourInterface.super.test();
        System.out.println("test imple");
    }



    static  void display(){
        System.out.println("Print");
    }
}
