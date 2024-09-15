package Decorator;

public class Main {
    public static void main(String[] args) {
        // Perusprintteri
        Printer printer = new BasicPrinter();
        printer.print("Hello World!");

        // Koristelijalla varustettu printteri
        Printer printer2 = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        printer2.print("Hello World!");
    }
}
