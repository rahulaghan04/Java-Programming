package com.Rahulaghan;

import java.util.ArrayList;

/*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the registered with their names in the central database.
*/

//SelfSolved
/*class Book{
    private String bookName;
    private String authorName;
    private String issuedTo;
    private Date issuedOn;

    public Book(String bookName, String authorName){
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public String getBookName(){
        return bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getIssuedTo(){
        return issuedTo;
    }
    public void setIssuedTo(String issuedTo){
        this.issuedTo = issuedTo;
        this.issuedOn = new Date();
    }
    public Date getIssuedOn(){
        return issuedOn;
    }
    public void returnBook(){
        this.issuedTo = null;
        this.issuedOn = null;
    }
    public String toString(){
        return "Book{"+"name: '"+bookName+'\''+",Author: '"+authorName+'\''+",Issued to: '"+issuedTo+'\''+",Issued On: "+issuedOn+'}';
    }
}
class Library2{
    private List<Book> books;
    private HashMap<String, Student> students;
    public Library2(){
        this.books = new ArrayList<>();
        this.students = new HashMap<>();
    }
    public void addBook(String bookName, String authorName){
        Book book = new Book(bookName, authorName);
        books.add(book);
    }
    public void addStudent(String studentName){
        Student student = new Student(studentName);
        students.put(studentName, student);
    }
    public void issuedBook(String bookName, String studentName){
        Book book = findBook(bookName);
        Student student = students.get(studentName);
        if(book != null && student != null && book.getIssuedTo() == null){
            book.setIssuedTo(studentName);
            System.out.println("Book issued Successfully...");
        }
        else {
            System.out.println("Book not available or student not registered or book is already issued by another student");
        }
    }
    public void returnBook(String bookName){
        Book book = findBook(bookName);
        if(book != null && book.getIssuedTo() != null){
            book.returnBook();
            System.out.println("Book returned successfully.");
        }
        else {
            System.out.println("Book is not issued or not found.");
        }
    }
    public Book findBook(String bookName){
        for (Book book: books){
            if(book.getBookName().equalsIgnoreCase(bookName)){
                return book;
            }
        }
        return null;
    }
    public void displayBooks(){
        System.out.println("Books in the Library: ");
        for(Book book: books){
            System.out.println(book);
        }
    }
}
class Student{
    private final String studentName;
    public Student(String name){
        this.studentName = name;
    }
    public String getStudentName(){
        return studentName;
    }
}
public class Exercise8 {
    public static void main(String[] args) {
        /*Library2 lib2 = new Library2();

        lib2.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        lib2.addBook("Gary the Hero", "Davidson Peter");
        lib2.addBook("The dark humor", "Rexo Lorono");
        lib2.addBook("TimeLine", "Bob Peterson");
        lib2.addBook("The Great Gossip", "Holler Radisanto");

        lib2.addStudent("Rahul");
        lib2.addStudent("Ram");
        lib2.addStudent("Donny");
        lib2.addStudent("Harry");

        lib2.displayBooks();

        lib2.issuedBook("TimeLine","Donny");
        lib2.findBook("The Great Gossip");

        lib2.displayBooks();

        lib2.returnBook("TimeLine");
        lib2.displayBooks();
    }
}*/

class Book {
    public String bookName, authorName;
    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}' + "\n";
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the Library: ");
        this.books.add(book);
    }
    public void issuedBook(Book bk, String issued_to){
        System.out.println(bk+" Book has been issued from the Library to "+issued_to);
        this.books.remove(bk);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned from ");
        this.books.add(b);
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book bk1 = new Book("C Programming", "Abdul Kabul");
        bk.add(bk1);
        Book bk2 = new Book("C++ Programming", "Raghunath Amardev");
        bk.add(bk2);
        Book bk3 = new Book("Java Programming", "Adrien Brook");
        bk.add(bk3);
        Book bk4 = new Book("Python Programming", "Kate Williamson");
        bk.add(bk4);
        Book bk5 = new Book("PHP Programming", "Peter Williamson");
        bk.add(bk5);

        MyLibrary myLib = new MyLibrary(bk);
        myLib.addBook(new Book("Rust Programming","Ryan Valerian"));
        System.out.println();
        System.out.println(myLib.books);
        System.out.println();
        myLib.issuedBook(bk1,"Rahul");
        System.out.println();
        System.out.println(myLib.books);
        System.out.println();
        myLib.returnBook(bk1);
        System.out.println();
        System.out.println(myLib.books);
    }
}