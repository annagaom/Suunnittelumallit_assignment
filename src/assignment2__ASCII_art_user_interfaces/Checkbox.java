package assignment2__ASCII_art_user_interfaces;

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

