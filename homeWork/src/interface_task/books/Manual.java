package interface_task.books;

import interface_task.books.Book;

/**
 * Created by Nastia on 24.01.17.
 */
public class Manual extends Book {

    @Override
    public void printBook() {
        System.out.println("This is manual");
    }
}
