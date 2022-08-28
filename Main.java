import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();

        Book book1=new Book("Şeker Portakalı",183, "José Mauro de Vasconcelos", 1968);
        Book book2=new Book("Delifişek", 160, "José Mauro de Vasconcelos",1960);
        Book book3=new Book("Kürk Mantolu Madonna",  177,"Sabahattin Ali", 1943);
        Book book4=new Book("Fahrenheit 451", 350, "Ray Bradbury",1953);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);

        System.out.println("Sort by name");

        for(Book bookname: book){
            System.out.println("Book name :" + bookname.getName() +
                    "\nNumber of page :" + bookname.getNumberOfPage() +
                    "\nAuthor Name :" + bookname.getAuthorName() +
                    "\nReleased Date :" + bookname.getReleaseDate());
            System.out.println("=======================================");
        }

        TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPage()-o2.getNumberOfPage();
            }
        });

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println("Sort by name");

        for(Book bookPage: book){
            System.out.println("Book name :" + bookPage.getName() +
                    "\nNumber of page :" + bookPage.getNumberOfPage() +
                    "\nAuthor Name :" + bookPage.getAuthorName() +
                    "\nReleased Date :" + bookPage.getReleaseDate());
            System.out.println("=======================================");
        }
    }
}
