package interface_task.books.books;

import interface_task.books.books.Encyclopedia;
import interface_task.books.books.Manual;
import interface_task.books.books.Printable;

/**
 * Created by Nastia on 24.01.17.
 */
public class Run {
    public static void main(String[] args) {

        Printable manual = new Manual();
        Printable encyclopedia = new Encyclopedia();

        manual.printBook();
        encyclopedia.printBook();
    }
}
