package Decorator;

import java.util.Base64;

public class EncryptedPrinter implements Printer {
    private Printer wrappedPrinter;

    public EncryptedPrinter(Printer printer) {
        this.wrappedPrinter = printer;
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encryptMessage(message);
        wrappedPrinter.print(encryptedMessage);
    }

    // Encrypts the message using Base64 encoding
    private String encryptMessage(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}

