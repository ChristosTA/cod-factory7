package gr.aueb.cf.ch12;

public class StudentsDemo {

    public static void main(String[] args) {
        Student student = new Student();                                    //Invoke default constructor
        Student bob = new Student(2 , " bob" , "D");  //Καλουμε τον Overloaded constructor

        bob.setLastname("Dylan");

        student.setId(1);                   //        student.id = 1;
        student.setFirstname("Alice");      //        student.firstname = "Alice";
        student.setLastname("W.");          //        student.lastname = "W.";




        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname : " + student.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname : " + bob.getLastname());

        System.out.println("Studen instances' count : " + student.getStudentsCount());





//        System.out.println("Id : " + student.id);
//        System.out.println("Firstname : " + student.firstname);
//        System.out.println("Lastname :" + student.lastname);
    }
}
