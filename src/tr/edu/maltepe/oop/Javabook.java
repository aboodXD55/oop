package tr.edu.maltepe.oop;

public class Javabook {

    private String bookname;
    private int n;
    private boolean borrowed;


    public Javabook(String bookname, int n) {
        this.bookname = bookname;
        this.n = n;
        this.borrowed = false;
    }

    public void borrowed(){
        this.borrowed = true;
    }

    public void returned(){
        this.borrowed = false;
    }

    public boolean isBorrowed(){
        return this.borrowed;
    }

    public void setBookName(String bookName)
    {
        this.bookname=bookName;
    }

    public String hazem()
    {
        return bookname;
    }

    public int getN() {
        return n;
    }

    public void setN (int n) {
        this.n = n;
    }

    @Override
    public String toString(){
        return "Javabook [bookname=" + bookname + "pages=" + n + "]";
    }
    /*public void getN (int N){this.n = N;}
    public void pageNo(int pno){
        System.out.println("reed page" + pno);
    }*/

}




