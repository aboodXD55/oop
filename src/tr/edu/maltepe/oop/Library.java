package tr.edu.maltepe.oop;
import java.awt.print.Book;
import java.util.*;

public class Library {

    Vector books = new Vector();
    public void addBook(Javabook book){
        books.add(book);
    }
    public void Borrow(String name,String bookName)
    {
        System.out.println(name+" borrowed ("+bookName+")");
    }
    public void Return(String name,String bookName)
    {
        System.out.println(name+" return ("+bookName+")");
    }
    public void BookList()
    {
        
    }
}
/*
public void add_book(javabook abook){
    books.add(abook);
}
void list_book(){
    for (int i=0; i< books.size();i++){
        javabook temp=(javabook) books.get(i):
        System.out.print(books.get(i));
    }
}*/

