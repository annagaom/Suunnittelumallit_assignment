package assignment2__ASCII_art_user_interfaces;

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

// ButtonA tyyli
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

// ButtonB tyyli
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





