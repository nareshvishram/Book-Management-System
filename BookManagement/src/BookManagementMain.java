import author.Author;
import book.Book;


public class BookManagementMain {

    public static void main(String[] args) {
        //create an object of the book class
        Author author=new Author("Snehal Saran","ss@gmail.com",'F');
        Book book=new Book("Lens Queen",author,160.56,100);



        //print details
        System.out.println("--------------Author Details--------------------");
        System.out.println("Author Name: "+book.getAuthor().getName());
        System.out.println("Author Email: "+book.getAuthor().getEmail());
        System.out.println("Author Gender: "+book.getAuthor().getGender());

        System.out.println("--------------Book Details--------------------");
        System.out.println("Book Name: "+book.getName());
        System.out.println("Book Price: "+book.getPrice());
        System.out.println("Book Quantity: "+book.getQtyInStock());
        System.out.println("--------------End Details--------------------");
    }
}
