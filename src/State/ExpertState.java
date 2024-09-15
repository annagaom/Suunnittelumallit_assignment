package State;

public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is training...");
        character.gainExperience(20);
        if (character.getExperience() >= 300) {
            character.levelUp(new MasterState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " is meditating...");
        character.gainHealth(15);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " is fighting...");
        character.loseHealth(20);
        character.gainExperience(30);
        if (character.getExperience() >= 300) {
            character.levelUp(new MasterState());
        }
    }
}
