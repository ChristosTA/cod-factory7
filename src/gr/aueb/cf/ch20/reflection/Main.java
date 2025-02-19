package gr.aueb.cf.ch20.reflection;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Teacher.class;
        Class<?> aClass = Class.forName("gr.aueb.cf.ch20.reflection.Teacher");

        Constructor<?>[] publicConstructors = Teacher.class.getConstructors();
        Constructor<?>[] constructorsList = Teacher.class.getDeclaredConstructors();

//        Constructor<?> defaultCtor = clazz.getDeclaredConstructor();

    }
}
