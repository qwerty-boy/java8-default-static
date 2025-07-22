package src;

public class Main {
    public static void main(String[] args) {
        //testing default methods
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.test();

        //testing static methods
        MyInterfaceImpl.display();
        MyInterface.display();

    }
}