package interfaces;

interface Issuable {
 void issueBook();
}

//Encapsulation
class Book {
 private int bookId;
 private String title;

 public void setBookId(int bookId) {
     this.bookId = bookId;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public int getBookId() {
     return bookId;
 }

 public String getTitle() {
     return title;
 }
}

//Abstract Class
abstract class LibraryMember {
 protected String memberName;

 LibraryMember(String memberName) {
     this.memberName = memberName;
 }

 abstract void displayMemberDetails();
}

//Concrete Class
class StudentMember extends LibraryMember implements Issuable {

 StudentMember(String memberName) {
     super(memberName);
 }

 public void issueBook() {
     System.out.println("Book issued successfully.");
 }

 void displayMemberDetails() {
     System.out.println("Member Name: " + memberName);
 }
}

public class LibraryManagementSystem {
 public static void main(String[] args) {

     Book book = new Book();
     book.setBookId(101);
     book.setTitle("Java Programming");

     StudentMember student = new StudentMember("Tanuja");

     System.out.println("Book ID: " + book.getBookId());
     System.out.println("Book Title: " + book.getTitle());

     student.displayMemberDetails();
     student.issueBook();
 }
}