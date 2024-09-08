package singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;
    private BufferedWriter writer;
    private String currentFileName = "default_log.txt";

    // Private constructor to prevent instantiation
    private Logger() {
        try {
            writer = new BufferedWriter(new FileWriter(currentFileName, true));
            System.out.println("Opened log file: " + currentFileName);
        } catch (IOException e) {
            System.err.println("Failed to open log file: " + e.getMessage());
        }
    }

    // Singleton getInstance method
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to write a log message to the file
    public synchronized void write(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
            System.out.println("Wrote log message: " + message);
        } catch (IOException e) {
            System.err.println("Failed to write log message: " + e.getMessage());
        }
    }

    // Method to change the log file
    public synchronized void setFileName(String newFileName) {
        try {
            // Close the current writer
            if (writer != null) {
                writer.close();
            }
            // Open the new file for writing
            currentFileName = newFileName;
            writer = new BufferedWriter(new FileWriter(currentFileName, true));
            System.out.println("Changed log file to: " + currentFileName);
        } catch (IOException e) {
            System.err.println("Failed to change log file: " + e.getMessage());
        }
    }

    // Close the writer when done
    public synchronized void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.err.println("Failed to close log file: " + e.getMessage());
        }
    }
}
