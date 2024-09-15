package State;

public class GameCharacter {
    private String name;
    private int level;
    private int experience;
    private int health;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.health = 100;
        this.state = new NoviceState();
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    public void gainExperience(int exp) {
        experience += exp;
        System.out.println(name + " gained " + exp + " experience. Total experience: " + experience);
    }

    public void gainHealth(int healthPoints) {
        health += healthPoints;
        System.out.println(name + " gained " + healthPoints + " health. Current health: " + health);
    }

    public void loseHealth(int damage) {
        health -= damage;
        System.out.println(name + " lost " + damage + " health. Current health: " + health);
        if (health <= 0) {
            System.out.println(name + " has died.");
        }
    }

    public void levelUp(State newState) {
        level++;
        state = newState;
        System.out.println(name + " has leveled up! Current level: " + level);
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void displayStatus() {
        System.out.println("Name: " + name + ", Level: " + level + ", Experience: " + experience + ", Health: " + health);
    }
}
