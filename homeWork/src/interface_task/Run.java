package interface_task;

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
