package tr.edu.maltepe.oop;

public class person
{
    private String name;
    private int age;
    void setName(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        return name;
    }
    void setAge(String newAge)
    {
        age = Integer.parseInt(newAge);
    }
    public int getAge()
    {
        return age;
    }
}