package assignment2__ASCII_art_user_interfaces;

// Main class to demonstrate the Abstract Factory usage
public class Main {
    public static void main(String[] args) {
        //UIFactory factory = new AFactory();
        UIFactory factory = new BFactory();


        Button button = factory.createButton("OK");
        TextField textField = factory.createTextField("Enter Name");
        Checkbox checkbox = factory.createCheckbox("I agree");

        button.display();
        textField.display();
        checkbox.display();

        // Change content dynamically
        button.setText("Submit");
        textField.setText("Enter Age");
        checkbox.setText("I accept");

        button.display();
        textField.display();
        checkbox.display();
    }
}