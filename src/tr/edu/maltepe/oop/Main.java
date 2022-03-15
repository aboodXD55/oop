package tr.edu.maltepe.oop;

public class Main{

    public static void main(String [] er)
    {

        Student Student1= new Student();
        Student1.setName("hadi");
        Student1.setAge(String.valueOf(23));
        Student1.setstu_ID(55);
        Student1.studying();

        Prof prof1= new Prof();
        prof1.setName("ensar");
        prof1.setAge(String.valueOf(50));
        prof1.setPro_ID(13);
        prof1.teaches();

        System.out.println("Student Name: " + Student1.getName());
        System.out.println("Age of Student is:"+Student1.getAge());
        System.out.println("Student ID: "+Student1.getstu_ID());


        System.out.println("Prof Name: " + prof1.getName());
        System.out.println("Age of Prof is:"+prof1.getAge());
        System.out.println("Prof ID: "+prof1.getpro_ID(13));
    }
}