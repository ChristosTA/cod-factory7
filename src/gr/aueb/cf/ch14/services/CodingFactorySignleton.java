package gr.aueb.cf.ch14.services;

public class CodingFactorySignleton {
    // Eager
    private static final   CodingFactorySignleton INSTANCE = new CodingFactorySignleton();


    private CodingFactorySignleton() {

    }

    public static  CodingFactorySignleton getInstance(){
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}

