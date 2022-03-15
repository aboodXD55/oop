package tr.edu.maltepe.oop;

class Prof extends person
{
    private int pro_ID;
    public void setPro_ID (int pi) {

        pro_ID = pi;
    }
    public int getpro_ID(int i) {
        return pro_ID;

    }
    void teaches(){
        System.out.println("Prof is teaching now");
    }
}