package assignment1_RPGMapGenerator;

import java.util.Scanner;

public class Game {
    public Map createMap(String mapType, int width, int height) {
        if (mapType.equalsIgnoreCase("C")) {
            return new CityMap(width, height);
        } else if (mapType.equalsIgnoreCase("W")) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type");
        }
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter map type: c(city)/w(wilderness): ");
        String mapType = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter map width: ");
        int width = scanner.nextInt();

        System.out.print("Enter map height: ");
        int height = scanner.nextInt();

        Map gameMap = createMap(mapType, width, height);
        gameMap.display();

        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.main();
    }
}
