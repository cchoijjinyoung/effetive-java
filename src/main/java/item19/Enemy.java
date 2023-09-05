package item19;

public class Enemy {
    private String name;
    public Enemy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
