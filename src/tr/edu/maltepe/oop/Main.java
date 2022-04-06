package tr.edu.maltepe.oop;

import java.util.Vector;

public class Main{

    public static void main(String [] er)
    {

        Javabook book1 = new Javabook("javaBaisc",500);
        Javabook book2 = new Javabook("introToJava",500);
        Javabook book3 = new Javabook("javaOop",500);



        Student Student1= new Student();
        Student1.setName("hadi");
        Student1.setAge(23);
        Student1.setStu_ID(11);
        Student1.studying();

        Prof prof1= new Prof();
        prof1.setName("ensar");
        prof1.setAge(55);
        prof1.setPro_ID(13);
        prof1.teaches();

        System.out.println("Student Name: " + Student1.getName());
        System.out.println("Age of Student is:"+Student1.getAge());
        System.out.println("Student ID: "+Student1.getStu_ID());


        System.out.println("Prof Name: " + prof1.getName());
        System.out.println("Age of Prof is:"+prof1.getAge());
        System.out.println("Prof ID: "+prof1.getPro_ID());
    }
}