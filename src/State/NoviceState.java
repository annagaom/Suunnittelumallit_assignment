package State;

public class NoviceState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is training...");
        character.gainExperience(10);
        if (character.getExperience() >= 50) {
            character.levelUp(new IntermediateState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditation is not available at Novice level.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting is not available at Novice level.");
    }
}
