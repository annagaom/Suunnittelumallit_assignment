package Decorator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private Printer wrappedPrinter;
    private static final String FILE_NAME = "output.txt";

    public FilePrinter(Printer printer) {
        this.wrappedPrinter = printer;
    }

    @Override
    public void print(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        wrappedPrinter.print(message);
    }
}
