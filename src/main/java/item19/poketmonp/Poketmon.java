package item19.poketmonp;

public class Poketmon {
    String name;
    String type;

    public Poketmon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * @implSpec
     * implSpec 예시 코드입니다.
     *
     */
    @Override
    public String toString() {
        return "Poketmon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
