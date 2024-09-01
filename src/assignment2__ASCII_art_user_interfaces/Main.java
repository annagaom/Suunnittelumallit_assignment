package assignment2__ASCII_art_user_interfaces;























// Pääluokka, joka demonstroi käyttöä
public class Main {
    public static void main(String[] args) {

        // Valitse käytettävä tyyli A tai B
        //UIFactory factory = new AFactory();
        UIFactory factory = new BFactory();

        Button button = factory.createButton("Lähetä");
        TextField textField = factory.createTextField("Syötä nimi");
        Checkbox checkbox = factory.createCheckbox("Hyväksyn ehdot");

        // Näytä alkuperäinen tila
        System.out.println("Alkuperäinen tila:");
        button.display();
        textField.display();
        checkbox.display();

        // Muuta tekstejä dynaamisesti
        button.setText("Vahvista");
        textField.setText("Syötä sposti");
        checkbox.setText("Hyväksyn ehdot");

        // Näytä päivitetty tila
        checkbox.toggle();
        System.out.println("\nPäivitetty tila:");
        button.display();
        textField.display();
        checkbox.display();
    }
}
