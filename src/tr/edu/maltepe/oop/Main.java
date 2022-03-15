package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        student student1= new student();
        student1.setstudentname("hadi");
        student1.setstudentage(23);

        prof prof1= new prof();
        prof1.setprofname("ensar");
        prof1.setprofsalery(2000);

        System.out.println("student name is "+student1.getstudentname());
        System.out.println("student age is "+student1.getstudentage());
        System.out.println("prof name is "+prof1.getprofname());
        System.out.println("prof salery is "+prof1.getprofsalery());

    }
}