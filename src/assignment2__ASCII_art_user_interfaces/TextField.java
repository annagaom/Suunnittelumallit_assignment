package assignment2__ASCII_art_user_interfaces;

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



