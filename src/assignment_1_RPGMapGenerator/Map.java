package assignment_1_RPGMapGenerator;
import java.util.Random;

// Abstract Map Class
abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    protected abstract Tile createTile();

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}

// Concrete Map Classes
class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int randomType = rand.nextInt(3);
        return switch (randomType) {
            case 0 -> new RoadTile();
            case 1 -> new TreeTile();
            case 2 -> new BuildingTile();
            default -> throw new IllegalArgumentException("Unknown tile type");
        };
    }
}

class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int randomType = rand.nextInt(3);
        return switch (randomType) {
            case 0 -> new SwampTile();
            case 1 -> new WaterTile();
            case 2 -> new TreeTile();
            default -> throw new IllegalArgumentException("Unknown tile type");
        };
    }
}
