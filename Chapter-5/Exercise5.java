package com.Rahulaghan;
/*import java.util.ArrayList;
import java.util.List;
class Library{
    String[] bookArray = new String[20];
    private List<String> availableBooks;
    private List<String> issuedBooks;

    public Library(){
        availableBooks = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    public void addBook(String bookTitle){
        availableBooks.add(bookTitle);
        System.out.println(bookTitle+" this new book added successfully.");
    }

    public void issuedBook(String bookTitle){
        if(availableBooks.contains(bookTitle)){
            availableBooks.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println(bookTitle+" book has been issued by user.");
        }
        else {
            System.out.println(bookTitle+" this book is not available in library.");
        }
    }
    public void returnBook(String bookTitle){
        if(issuedBooks.contains(bookTitle)){
            issuedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println(bookTitle+"book is returned and collected by the user.");
        }
        else{
            System.out.println(bookTitle+"book is not returned by the user.");
        }
    }
    public void showAvailableBooks(){
        System.out.println("Show the available Books: ");
        if(availableBooks.isEmpty()){
            System.out.println("No books available.");
        }
        else{
            for(String book: availableBooks){
                System.out.println(book);
            }
        }
    }
//    bookArray[0] = "Clean Code: By Robert C. Martin";
//    bookArray[1] = "The Mythical Man-month: By Frederick Brooks";
//    bookArray[2] = "The Pragmatic Programmer: Your Journey to Mastery";
//    bookArray[3] = "Code Complete (2 Edition): By Steve McConnell";
//    bookArray[4] = "The Art of Computer Programming";
//    bookArray[5] = "Programming Pearls";
//    bookArray[6] = "Code: Charles Petzold";
//    bookArray[7] = "Introduction to Algorithms";
//    bookArray[8] = "Refactoring: Improving the Design of Existing Code";
//    bookArray[9] = "Design Patterns: Elements of Reusable Object-Oriented Software";
//    bookArray[10] = "Coders At Work";

}
public class Exercise5 {
    public static void main(String[] args) {
        //You have to implement a library using java class library.
        //methods : addBook, issueBook, returnBook, showAvailableBooks
        //Properties: Array to store the available books.
        //Array to store the issued books.
        Library library = new Library();

        library.addBook("Clean Code: By Robert C. Martin");
        library.addBook("The Mythical Man-month: By Frederick Brooks");
        library.addBook("The Pragmatic Programmer: Your Journey to Mastery");
        library.addBook("Code Complete (2 Edition): By Steve McConnell");
        library.addBook("The Art of Computer Programming");
        library.addBook("Programming Pearls");
        library.addBook("Code: Charles Petzold");
        library.addBook("Introduction to Algorithms");
        library.addBook("Refactoring: Improving the Design of Existing Code");
        library.addBook("Design Patterns: Elements of Reusable Object-Oriented Software");
        library.addBook("Coders At Work");

        library.showAvailableBooks();
        library.issuedBook("Coders At Work");

        library.showAvailableBooks();
        library.returnBook("Coders At Work");
        library.showAvailableBooks();
    }
}*/

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[200];
        this.no_of_books = 0;
    }
    void addBooks(String book){
        this.books[no_of_books] = book;
        System.out.println(book+" has been added.");
        no_of_books++;
    }
    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for(String book: this.books){
            if(book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String bookName){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(bookName)){
                System.out.println(bookName+" this book has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(bookName+" this book does not exist in library.");
    }
    void returnBook(String bookName){
        this.books[no_of_books] = bookName;
        System.out.println(bookName+" book is returned.");
        no_of_books++;
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBooks("Python Programming");
        library.addBooks("Java Programming");
        library.addBooks("C Programming");
        library.addBooks("C++ Programming");
        System.out.println();
        library.showAvailableBooks();
        System.out.println();
        library.issueBook("C Programming");
        System.out.println();
        library.showAvailableBooks();
        System.out.println();
        library.returnBook("C Programming");
        System.out.println();
        library.showAvailableBooks();
    }
}