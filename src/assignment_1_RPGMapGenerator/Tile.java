package assignment_1_RPGMapGenerator;
// Tile Interface
public interface Tile {
    char getCharacter();
    String getType();
    void action();  // Optional, not used in this assignment
}

// Concrete Tile Classes
class SwampTile implements Tile {
    public char getCharacter() {
        return 'S';
    }

    public String getType() {
        return "swamp";
    }

    public void action() {
        // Optional action method
    }
}

class TreeTile implements Tile {
    public char getCharacter() {
        return 'T';
    }

    public String getType() {
        return "tree";
    }

    public void action() {
        // Optional action method
    }
}

class WaterTile implements Tile {
    public char getCharacter() {
        return 'W';
    }

    public String getType() {
        return "water";
    }

    public void action() {
        // Optional action method
    }
}

class RoadTile implements Tile {
    public char getCharacter() {
        return 'R';
    }

    public String getType() {
        return "road";
    }

    public void action() {
        // Optional action method

    }
}

class ForestTile implements Tile {
    public char getCharacter() {
        return 'F';
    }

    public String getType() {
        return "forest";
    }

    public void action() {
        // Optional action method
    }
}

class BuildingTile implements Tile {
    public char getCharacter() {
        return 'B';
    }

    public String getType() {
        return "building";
    }

    public void action() {
        // Optional action method
    }
}
