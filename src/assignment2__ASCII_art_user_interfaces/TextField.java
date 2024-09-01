package assignment2__ASCII_art_user_interfaces;

abstract class TextField {
    protected String text;
    public abstract void display();
    public void setText(String text) {
        this.text = text;
    }
}

class TextFieldA extends TextField {
    public TextFieldA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("|TextFieldA: " + text + "|");
    }
}

class TextFieldB extends TextField {
    public TextFieldB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("===TextFieldB: " + text + "===");
    }
}

