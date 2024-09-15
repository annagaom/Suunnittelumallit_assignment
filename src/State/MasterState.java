package State;

public class MasterState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " has reached the Master level. No need to train.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " has reached the Master level. No need to meditate.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " has reached the Master level. No need to fight.");
    }
}
