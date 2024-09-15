package State;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Hero");

        while (true) {
            character.displayStatus();
            System.out.println("Choose an action: 1-Train, 2-Meditate, 3-Fight, 4-Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    character.train();
                    break;
                case 2:
                    character.meditate();
                    break;
                case 3:
                    character.fight();
                    break;
                case 4:
                    System.out.println("Exiting game...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            if (character.getHealth() <= 0) {
                System.out.println("Game Over. " + character.getName() + " has died.");
                break;
            }
        }
    }
}
