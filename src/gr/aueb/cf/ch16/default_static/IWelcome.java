package gr.aueb.cf.ch16.default_static;

public interface IWelcome {

    static void staticMethod() {
        System.out.println("Hello from IWelcome static method");
    }

    void helloWorld();


    default void  defaultMethod() {
        System.out.println("Default method from IWelcome");
    }
}
