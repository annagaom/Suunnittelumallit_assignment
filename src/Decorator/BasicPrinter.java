package Decorator;

public class BasicPrinter implements Printer {
    @Override
    public void print(String massage) {
        System.out.println(massage);
    }
}
