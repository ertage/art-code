package interface_task.books.books;

/**
 * Created by Nastia on 24.01.17.
 */
public abstract class Book implements Printable {

    @Override
    public void printBook() {
        System.out.println("This is book");
    }
}
