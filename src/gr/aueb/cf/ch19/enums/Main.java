package gr.aueb.cf.ch19.enums;

public class Main {

    public static void main(String[] args) {
        UserRole roleStudent = UserRole.STUDENTS;
        String strRole = roleStudent.name();        //Like toString()
        System.out.println(strRole);

        UserRole role = UserRole.valueOf(strRole);
    }
}
