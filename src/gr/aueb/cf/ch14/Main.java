package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.model.Point;
import gr.aueb.cf.ch14.model.Teacher;
import gr.aueb.cf.ch14.services.CodingFactorySignleton;
import gr.aueb.cf.ch14.services.HelloUtil;
import org.w3c.dom.CDATASection;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1,"Ath.","Adnroutsos");
        Teacher teacher2 = new Teacher(2,"A.","Giannoutsou");
        Teacher teacher3 = new Teacher(3,"C.","Papadopoulos");

        HelloUtil.sayHello();


        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        CodingFactorySignleton cf1 = CodingFactorySignleton.getInstance();
        CodingFactorySignleton cf2 = CodingFactorySignleton.getInstance();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(cf1);
        System.out.println(cf2);
    }
}
