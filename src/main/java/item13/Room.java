package item13;

public class Room implements Cloneable { // Clonable을 구현하지 않으면 clone메서드를 사용하지 못한다.
    private int x = 0;
    private String y = "방";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Room) super.clone();
    }

    public void hello() {
        System.out.println("부모클래스");
    }
}
