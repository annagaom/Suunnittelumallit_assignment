package assignment2__ASCII_art_user_interfaces;

// Abstrakti Button-luokka
abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}

// Abstrakti TextField-luokka
abstract class TextField {
    protected String text;

    public TextField(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}

// Abstrakti Checkbox-luokka
abstract class Checkbox {
    protected String text;
    protected boolean checked;

    public Checkbox(String text) {
        this.text = text;
        this.checked = false;
    }

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }

    public void toggle() {
        this.checked = !this.checked;
    }
}

// ButtonA-luokka tyyli A:lle
class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("+---------+");
        System.out.println("|| " + text + " ||");
        System.out.println("+---------+");
    }
}

// TextFieldA-luokka tyyli A:lle
class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("--------------");
        System.out.println("| " + text + " |");
        System.out.println("--------------");
    }
}

// CheckboxA-luokka tyyli A:lle
class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        if (checked)
            System.out.print("[X] " + text);
        else {
            System.out.print("[ ] " + text);
        }
    }

}

// ButtonB-luokka tyyli B:lle
class ButtonB extends Button {
    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {

        System.out.println(">>>>>>>>>>>");

        System.out.println("< " + text + " >");
        System.out.println(">>>>>>>>>>>");
    }
}

// TextFieldB-luokka tyyli B:lle
class TextFieldB extends TextField {
    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("****************");
        System.out.println("* " + text + " *");
        System.out.println("****************");
    }
}

// CheckboxB-luokka tyyli B:lle
class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        if (checked)
            System.out.print("{X} " + text);
        else {
            System.out.print("{ } " + text);
        }
    }
}

// Abstrakti tehdasluokka UIFactory
abstract class UIFactory {
    public abstract Button createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract Checkbox createCheckbox(String text);
}

// AFactory-luokka, joka luo tyyli A:n elementtejä
class AFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxA(text);
    }
}

// BFactory-luokka, joka luo tyyli B:n elementtejä
class BFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxB(text);
    }
}

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
