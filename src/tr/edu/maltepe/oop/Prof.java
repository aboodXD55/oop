package tr.edu.maltepe.oop;

class Prof extends Person
{
    private int pro_ID;

    public int getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID (int pi) {
        this.pro_ID = pi;
    }

    void teaches(){
        System.out.println("Prof is teaching now");
    }
}