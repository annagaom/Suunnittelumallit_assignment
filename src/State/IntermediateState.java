package State;

public class IntermediateState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is training...");
        character.gainExperience(15);
        if (character.getExperience() >= 150) {
            character.levelUp(new ExpertState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " is meditating...");
        character.gainHealth(10);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting is not available at Intermediate level.");
    }
}
