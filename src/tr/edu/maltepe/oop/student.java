package tr.edu.maltepe.oop;

class Student extends person
{
    private int stu_ID;

    public void setstu_ID (int si) {

        stu_ID = si;
    }
    public int getstu_ID() {
        return stu_ID;
    }
    void studying(){
        System.out.println("Student is studying now");
    }
}