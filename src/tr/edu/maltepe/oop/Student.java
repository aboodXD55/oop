package tr.edu.maltepe.oop;

class Student extends Person
{
    private int stu_ID;

    public int getStu_ID() {
        return stu_ID;
    }

    public void setStu_ID (int si) {
        this.stu_ID = si;
    }

    void studying(){
        System.out.println("Student is studying now");
    }
    public void getBook(Javabook book){

    }
}