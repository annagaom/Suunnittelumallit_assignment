package assignment2__ASCII_art_user_interfaces;

abstract class Checkbox {
    protected String text;
    public abstract void display();
    public void setText(String text) {
        this.text = text;
    }
}

class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("[ ] CheckboxA: " + text);
    }
}

class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("(X) CheckboxB: " + text);
    }
}



