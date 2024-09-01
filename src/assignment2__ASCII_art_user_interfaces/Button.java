package assignment2__ASCII_art_user_interfaces;

// Abstract product classes
abstract class Button {
    protected String text;
    public abstract void display();
    public void setText(String text) {
        this.text = text;
    }
}

// Concrete product classes for Style A
class ButtonA extends Button {
    public ButtonA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("[ButtonA: " + text + "]");
    }
}

// Concrete product classes for Style B
class ButtonB extends Button {
    public ButtonB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("<<< ButtonB: " + text + " >>>");
    }
}

