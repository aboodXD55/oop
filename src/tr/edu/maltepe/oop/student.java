package tr.edu.maltepe.oop;

public class student extends person
{
    public String getstudentname()
    {
        return name;
    }
    public int getstudentage()
    {
        return age;
    }

    public void setstudentname(String name)
    {
        this.name = name;
    }
    public void setstudentage(int age)
    {
        this.age = age;
    }
}